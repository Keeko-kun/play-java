var app = angular.module("switch-it-up", []);
app.controller("switchCtrl", function ($scope, $http) {
    $scope.reviews = [];

    if (getCookie("token") != ""){
        $http({
            url: "name/" + getCookie("token"),
            method: "POST"
        }).then(function successCallback(response) {
            var name = response.data;
            if (name == ""){

            }
            else {
                $('#userBox').text('Welcome back, ' + name);
            }
        }, function errorCallback(response) {
            $scope.error = response.statusText;
        });
    }

    $http({
        url: "reviews/topsix",
        method: "GET"
    }).then(function successCallback(response) {
        $scope.reviews = response.data;
    }, function errorCallback(response) {
        $scope.error = response.statusText;
    });
});