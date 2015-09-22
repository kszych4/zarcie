function Hello($scope, $http) {
    $http.get('http://localhost:8080/ctrl').
        success(function(data) {
            $scope.greeting = data;
        });
}