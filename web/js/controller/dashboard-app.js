/**
 * Created by Juilee on 5/17/2017.
 */
var myApp = angular.module("myApp", [
    "ngRoute",
    "mainController"
]);
myApp.config(["$routeProvider", function($routeProvider){
    $routeProvider.when("/dashboard/", {
        templateUrl: "partials/about.html",
        controller: "AboutController"
    }).when("/dashboard/about", {
        templateUrl: "partials/about.html",
        controller: "AboutController"
    }).otherwise({
        redirectTo: "/dashboard/"
    })
}])