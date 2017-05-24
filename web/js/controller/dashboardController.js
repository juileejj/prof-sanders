/**
 * Created by Juilee on 5/17/2017.
 */
var mainController = angular.module("mainController", []);

mainController.controller("LoginController",["$scope","$http","$window",function ($scope,$http,$window) {
    $scope.login = function () {

        $http.post('http://localhost:8080/login', {
                params: {
                    email: $scope.email,
                    password: $scope.password,
                },headers : {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
                }
            }).then(function (response) {
            alert("abc");
            $window.location.href = '../dashboard.html';
            }).catch(function (response) {
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


/*Speaking Controller*/
mainController.controller("SpeakingController",["$scope","$http",function ($scope,$http){

    $scope.addSpeaking = function () {
        debugger;
        var data = $('#addSpeakingForm').serializeObject();
        data = JSON.stringify(data);
        var url = 'http://localhost:8080/speaking';
        var config = {
            headers: {
                'Content-Type': 'application/json;'
            }
        }

        $http.post(url, data, config)
            .then(
                function (response) {
                    $('#addSpeakingForm')[0].reset();
                    alert(response.data.title);
                    $scope.getSpeakings();
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

    $scope.deleteSpeaking = function (id) {
        $http.delete('http://localhost:8080/speaking', {params:{speakingId:id}},  { headers: {
            'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
        }})
            .then(
                function (response) {
                    alert("Deleted successfully");
                    $scope.getSpeakings();
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

/*Book Controller*/
mainController.controller("BookController",["$scope","$http",function ($scope,$http){

    $scope.addBook = function () {
        debugger;
        var data = $('#addBookForm').serializeObject();
        data = JSON.stringify(data);
        var url = 'http://localhost:8080/book';
        var config = {
            headers: {
                'Content-Type': 'application/json;'
            }
        }

        $http.post(url, data, config)
            .then(
                function (response) {
                    $('#addBookForm')[0].reset();
                    $scope.getBooks();
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

    $scope.deleteBook = function (id) {
        $http.delete('http://localhost:8080/book', {params:{bookId:id}},  { headers: {
            'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
        }})
            .then(
                function (response) {
                    alert("Deleted successfully");
                    $scope.getBooks();
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

/*Testimonial Controller*/
mainController.controller("TestController",["$scope","$http",function ($scope,$http){

    $scope.addTest = function () {
        var data = $('#addTestForm').serializeObject();
        data = JSON.stringify(data);
        var url = 'http://localhost:8080/testimonial';
        var config = {
            headers: {
                'Content-Type': 'application/json;'
            }
        }

        $http.post(url, data, config)
            .then(
                function (response) {
                    $('#addTestForm')[0].reset();
                    $scope.getTests();
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

    $scope.deleteTest = function (id) {

        $http.delete('http://localhost:8080/testimonial', {params:{testimonialId:id}},  { headers: {
            'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
        }})
            .then(
                function (response) {
                    alert("Deleted successfully");
                    $scope.getTests();
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