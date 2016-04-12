var app = angular.module('MainApp', ['ngRoute', 'ngAnimate', 'ngAria', 'ngMaterial', 'ngMessages']);

app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "tmp/home.html",
            controller: "HomeCtrl"
        })
        .when("/login", {
            templateUrl: "tmp/login.html",
            controller: "LoginCtrl"
        })
        .when("/register", {
            templateUrl: "tmp/register.html",
            controller: "RegisterCtrl"
        })
        .when("/home", {
            templateUrl: "tmp/home.html",
            controller: "HomeCtrl"
        })
        .when("/cart", {
            templateUrl: "tmp/cart.html",
            controller: "CartCtrl"
        });
}]);

app.controller('LoginCtrl', function ($scope, $location) {
    $scope.goToRegister = function () {
        $location.path("/register")
    };

    $scope.goToForgetPassword = function () {
        alert("on progress");
    };

    $scope.login = function () {
        $location.path("/home");
    };
});

app.controller('HeaderCtrl', function ($scope, $location) {
    $scope.goToHome = function () {
        $location.path("/home");
    };
    $scope.goToCart = function () {
        $location.path("/cart");
    };
    $scope.goToLogin = function () {
        $location.path("/login");
    };
    $scope.goToRegister = function () {
        $location.path("/register");
    };
});

app.controller('RegisterCtrl', function ($scope, $location) {
    $scope.register = function () {
        alert("registration success");
        $location.path("/login");
    };
});

app.controller('CartCtrl', function ($scope, $location, $http) {
    $http.get('http://localhost:8080/cart').
    success(function (data) {
        $scope.cart = data.products;
    });

    $scope.checkout = function () {
        alert("checkout success");
        $location.path('/home');
    }
});

app.controller('HomeCtrl', function ($scope, $http) {
    $http.get('http://localhost:8080/products').
    success(function (data) {
        $scope.products = data.products;
    });
});