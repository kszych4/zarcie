angular.module("pentaZarcie", [])

    .controller("usersCtrl", function($scope,$http) {
        $http.get('http://localhost:8080/users').
            success(function(data) {
                $scope.users = data;
            });

    })
    .controller("groupsCtrl", function($scope,$http) {
        $http.get('http://localhost:8080/groups').
            success(function(data) {
                $scope.groups = data;
            });

    })
    .controller("placesCtrl", function($scope,$http) {
        $http.get('http://localhost:8080/places').
            success(function(data) {
                $scope.places = data;
            });

    });