'use strict';

angular.module('pentaZarcie.zamowienia', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/zamowienia', {
            templateUrl: 'zamowienia/zamowienia.html',
            controller: 'ZamowieniaCtrl'
        });
    }])

    .controller('ZamowieniaCtrl', [function() {

    }]);