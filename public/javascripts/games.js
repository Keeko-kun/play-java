var app = angular.module("switch-it-up", []);
app.controller("switchCtrl", function ($scope, $http, $window) {
    $scope.games = [];
    $scope.developers = [];

    $scope.name = '';
    $scope.price = '';
    $scope.url = '';
    $scope.selectedDev = [];

    $scope.studio = '';
    $scope.ceo = '';
    $scope.parent = '';
    $scope.indie = false;

    $scope.admin = false;
    $scope.loaded = false;
    $scope.thirdParty = false;

    $scope.addGame = function(){

        var price = parseInt($scope.price);

        if (isNaN(price)){
            console.log("value is null");
            return;
        }

        $http({
            url: "games/" + $scope.name + "/" + price + "/" + $scope.url + "/" + $scope.selectedDev.id,
            method: "POST"
        }).then(function successCallback(response) {
            $window.location.reload();
        }, function errorCallback(response) {
            $scope.error = response.statusText;
        });
    };

    $scope.addDeveloper = function(){
        if ($scope.parent == ''){
            $scope.parent = 'NaN';
        }

        $http({
            url: "developer/" + $scope.studio + "/" +  $scope.ceo + "/" + $scope.thirdParty + "/" + $scope.parent + "/" + $scope.indie,
            method: "POST"
        }).then(function successCallback(response) {
            $window.location.reload();
        }, function errorCallback(response) {
            $scope.error = response.statusText;
        });
    }

    $http({
        url: "game",
        method: "GET"
    }).then(function successCallback(response) {
        $scope.games = response.data;
        $http({
            url: "developer",
            method: "POST"
        }).then(function successCallback(response) {
            $scope.developers = response.data;
            $scope.loaded = true;
        }, function errorCallback(response) {
            $scope.error = response.statusText;
        });
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