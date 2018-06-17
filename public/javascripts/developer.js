var app = angular.module("switch-it-up", []);
app.controller("switchCtrl", function ($scope, $http, $window) {
    $scope.reviews = [];

    $scope.developer = [];

    $scope.loaded = false;
    $scope.indies = false;

    $scope.showIndies = false;

    $scope.isIndie = '';

    var id = window.location.pathname.split('/').pop();
    console.log(id);

    $http({
        url: "../developer/" + id,
        method: "POST"
    }).then(function successCallback(response) {
        $scope.reviews = response.data;
        $scope.reviews.reverse();

        for (var dev in $scope.reviews[0].game.developers){
            if ($scope.reviews[0].game.developers[dev].id == id){
                $scope.developer = $scope.reviews[0].game.developers[dev];
                break;
            }
        }


        $scope.indies = $scope.developer.indieStudio;
        if ($scope.indies == undefined){
            $scope.indies = false;
            $scope.showIndies = false;
            $scope.isIndie = 'No';
        }
        else if ($scope.indies == false){
            $scope.showIndies = true;
            $scope.isIndie = 'No'
        }
        else {
            $scope.isIndie = 'Yes';
            $scope.showIndies = true;
        }

        $scope.loaded = true;
    }, function errorCallback(response) {
        $scope.error = response.statusText;
    });

    if (getCookie("token") != ""){
        $http({
            url: "../name/" + getCookie("token"),
            method: "POST"
        }).then(function successCallback(response) {
            var name = response.data;
            if (name == ""){

            }
            else {
                $scope.verified = true;
            }
        }, function errorCallback(response) {
            $scope.error = response.statusText;
        });
    }
});