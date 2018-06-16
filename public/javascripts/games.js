var app = angular.module("switch-it-up", []);
app.controller("switchCtrl", function ($scope, $http, $window) {
    $scope.games = [];

    $scope.name = '';
    $scope.price = '';
    $scope.url = '';

    $scope.admin = false;
    $scope.loaded = false;

    $scope.addGame = function(){

        var price = parseInt($scope.price);

        if (isNaN(price)){
            console.log("value is null");
            return;
        }

        $http({
            url: "games/" + $scope.name + "/" + price + "/" + $scope.url,
            method: "POST"
        }).then(function successCallback(response) {
            $window.location.reload();
        }, function errorCallback(response) {
            $scope.error = response.statusText;
        });
    };

    $http({
        url: "game",
        method: "GET"
    }).then(function successCallback(response) {
        $scope.games = response.data;
        $scope.loaded = true;
    }, function errorCallback(response) {
        $scope.error = response.statusText;
    });

    if (getCookie("token") != "") {
        $http({
            url: "games/verify/" + getCookie("token"),
            method: "POST"
        }).then(function successCallback(response) {
            $scope.admin = response.data;
        }, function errorCallback(response) {
            $scope.error = response.statusText;
        });
    }
});