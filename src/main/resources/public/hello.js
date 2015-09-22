function Hello($scope, $http) {
    $http.get('http://localhost:8080/ctrl').
        success(function(data) {
            $scope.greeting = data;
        });
}

function groups($scope, $http) {
    $http.get('http://localhost:8080/groups').
        success(function(data) {
            $scope.groups = data;
        });
}

function places($scope, $http) {
    $http.get('http://localhost:8080/places').
        success(function(data) {
            $scope.places = data;
        });
}

function users($scope, $http) {
    $http.get('http://localhost:8080/users').
        success(function(data) {
            $scope.users = data;
        });
}