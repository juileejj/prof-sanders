/**
 * Created by Juilee on 5/17/2017.
 */
var mainController = angular.module("mainController", []);

mainController.controller("LoginController",["$scope","$http","$window",function ($scope,$http,$window) {
    $scope.login = function () {
        $http.get('http://localhost:8080/login', {
                params: {
                    email: $scope.email,
                    password: $scope.password,
                },headers : {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
                }
            }).success(function (response) {
            $window.location.href = '../dashboard.html';
            }).error(function (response) {
            $window.location.href = '../../dashboard/partials/login.html';
        })
    }
}]);

mainController.controller("AboutController",["$scope","$http",function ($scope,$http){

    $scope.addAbout = function () {
        debugger;
        var data = $('#addAboutForm').serializeObject();
        data = JSON.stringify(data);
        var url = 'http://localhost:8080/about';
        var config = {
            headers: {
                'Content-Type': 'application/json;'
            }
        }

        $http.post(url, data, config)
            .then(

                function (response) {

                    $('#addAboutForm')[0].reset();
                    alert(response.data.title);
                    $scope.getAbouts();
                    $scope.msg = "Created successfully";
                    $(".alert-success").show();
                    $(".alert-danger").hide();

                }
            )
            .catch(function (response)
            {
                    $(".alert-danger").show();
                    $(".alert-success").hide();
                    $scope.msg = "Connection problem.Please try again later!";
            });
    };
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
    
    $scope.deleteAbout = function (id) {
        $http.delete('http://localhost:8080/about', {params:{aboutId:id}},  { headers: {
            'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
        }})
            .then(
                function (response) {
                   /* alert("Deleted successfully");*/
                    $scope.getAbouts();
                }
            ).catch(
                    function (response) {
                        alert("Failure");}
                ).finally(
                    function () {

                    }
        );
    }
}]);