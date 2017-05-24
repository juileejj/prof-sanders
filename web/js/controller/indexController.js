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

indexController.controller("GetBookController",["$scope","$http",function ($scope,$http){
    $scope.getBooks = function () {
        var url = 'http://localhost:8080/book/all';
        var config = {
            headers: {
                'Content-Type': 'application/json;'
            }
        }

        $http.get(url, config)
            .then(
                function (response) {
                    $scope.books = JSON.parse(JSON.stringify(response.data));
                });
    };
}]);

indexController.controller("GetTestController",["$scope","$http",function ($scope,$http){
    $scope.getTests = function () {
        var url = 'http://localhost:8080/testimonial/all';
        var config = {
            headers: {
                'Content-Type': 'application/json;'
            }
        }

        $http.get(url, config)
            .then(
                function (response) {
                    $scope.tests = JSON.parse(JSON.stringify(response.data));
                });
    };
}]);

indexController.controller("GetSpeakController",["$scope","$http",function ($scope,$http){
    $scope.getSpeakings = function () {
        var url = 'http://localhost:8080/speaking/all';
        var config = {
            headers: {
                'Content-Type': 'application/json;'
            }
        }

        $http.get(url, config)
            .then(
                function (response) {
                    $scope.speakings = JSON.parse(JSON.stringify(response.data));
                });
    };
}]);