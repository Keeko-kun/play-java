var app = angular.module("switch-it-up", []);
app.controller("switchCtrl", function ($scope, $http, $window) {
    $scope.game = new Game();

    $scope.score = '';
    $scope.review = '';

    $scope.verified = false;
    $scope.loaded = false;

    var id = window.location.pathname.split('/').pop();
    console.log(id);

    $scope.post = function(){

        var score = parseInt($scope.score);

        if (isNaN(score)){
            console.log("value is bad");
            return;
        }
        else if(score > 100 || score < 0){
            return;
        }

        $http({
            url: "../review/" + id + "/" + score + "/" + $scope.review + "/" + getCookie("token"),
            method: "POST"
        }).then(function successCallback(response) {
            console.log("hey");
            $window.location.reload();
        }, function errorCallback(response) {
            $scope.error = response.statusText;
        });
    };

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