var app = angular.module("switch-it-up", []);
app.controller("switchCtrl", function ($scope, $http, $window) {
    $scope.review = new Review();

    $scope.loaded = false;

    var id = window.location.pathname.split('/').pop();
    console.log(id);

    $http({
        url: "../review/" + id,
        method: "POST"
    }).then(function successCallback(response) {
        $scope.review = response.data;
        $scope.loaded = true;
    }, function errorCallback(response) {
        $scope.error = response.statusText;
    });
});