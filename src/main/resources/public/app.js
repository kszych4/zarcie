'use strict';

// Declare app level module which depends on views, and components
angular.module('pentaZarcie', [
    'ngRoute',
    'pentaZarcie.zamowienia',
]).
    config(['$routeProvider', function($routeProvider) {
        $routeProvider.otherwise({redirectTo: '/'});
    }]);