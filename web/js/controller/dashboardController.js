/**
 * Created by Juilee on 5/17/2017.
 */
var mainController = angular.module("mainController", []);

mainController.controller("LoginController",["$scope","$http",function ($scope,$http) {
    $scope.login = function () {
        $http.post('http://localhost:8080/login', {
                params: {
                    email: $scope.email,
                    password: $scope.password,
                },headers : {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
                }
            }).then(function (response) {
                console.log(response.data);
            })
        /*if(user!=undefined)
        {
            $(location).attr("href", "#/dashboard");
        }
        else
        {
            alert('Incorrect Login');
        }*/
        ;
    }
}]);