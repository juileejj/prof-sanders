/**
 * Created by Juilee on 5/17/2017.
 */
var myApp = angular.module("myApp", [
    "ngRoute",
    "mainController"
]);
myApp.config(["$routeProvider", function($routeProvider){
    $routeProvider.when("/dashboard/", {
        templateUrl: "partials/home.html",
        controller: ""
    }).when("/dashboard/about", {
        templateUrl: "partials/about.html",
        controller: "AboutController"
    }).when("/dashboard/speaking", {
        templateUrl: "partials/speaking.html",
        controller: "SpeakingController"
    }).when("/dashboard/book", {
        templateUrl: "partials/book.html",
        controller: "BookController"
    }).when("/dashboard/testimonial", {
        templateUrl: "partials/testimonial.html",
        controller: "TestController"
    }).otherwise({
        redirectTo: "/dashboard/"
    })
}])