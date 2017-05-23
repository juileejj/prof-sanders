/**
 * Created by Juilee on 5/23/2017.
 */
var indexController = angular.module("indexController", []);

indexController.controller("GetAboutController",["$scope","$http",function ($scope,$http){
    $scope.getAbouts = function () {
        var url = 'http://localhost:8080/about/all';
        var config = {
            headers: {
                'Content-Type': 'application/json;'
            }
        }
        $http.get(url, config)
            .then(
                function (response) {
                    $scope.abouts = JSON.parse(JSON.stringify(response.data));
                });
    };
}]);