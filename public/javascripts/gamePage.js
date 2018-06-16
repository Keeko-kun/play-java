var app = angular.module("switch-it-up", []);
app.controller("switchCtrl", function ($scope, $http, $location) {
    $scope.game = new Game();

    $scope.score = '';
    $scope.review = '';

    $scope.verified = false;
    $scope.loaded = false;

    $scope.post = function(){

        console.log("post");
    };

    var id = window.location.pathname.split('/').pop();
    console.log(id);

    $http({
        url: "../game/" + id,
        method: "POST"
    }).then(function successCallback(response) {
        $scope.game = response.data;
        $scope.game.reviews.reverse();
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