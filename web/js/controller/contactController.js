/**
 * Created by Juilee on 3/30/2017.
 */
var contact = angular.module('contact',[]);
contact.contactController('contactController',function sendEmail($scope,$http) {

$scope.user =
{
    name: "",
    email: "",
    subject: "",
    message: ""
}

    $scope.sendEmail = function () {
    var data = $('#contactForm').serializeObject();
    data = JSON.stringify(data);
    alert(data);
    var url = 'http://localhost:3000/contact/email.json';
    var config = {
        headers : {
            'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
        }
}
    $http.post(url, data, config)
        .then(
            function(response){
                alert("Success");
            },
            function(response){
                alert("Error");
            }
        );
}
});