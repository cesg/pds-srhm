//var app = angular.module('SrhmApp', ['BoxService', 'angular-loading-bar', 'ui.bootstrap', 'alertService']);

app.controller('ReporteController', ['$scope', '$filter', 'BoxService', 'alertService', function ($scope, $filter, Box, alertService) {
    $scope.box = {};
    $scope.boxes = [];
    $scope.alerts = alertService.get();

    Box.all().success(function (data) {
        $scope.boxes = data;
    });

    $scope.max = 100;
    $scope.dynamic = 0;

    $scope.today = function () {
        $scope.dt = new Date();
        $scope.dt2 = new Date();
    };

    $scope.today();

    $scope.clear = function () {
        $scope.dt = null;
        $scope.dt2 = null;
    };

    // Disable weekend selection
    $scope.disabled = function (date, mode) {
        return ( mode === 'day' && ( date.getDay() === 0 || date.getDay() === 6 ) );
    };

    $scope.toggleMin = function () {
        $scope.minDate = $scope.minDate ? null : new Date();
    };
    $scope.toggleMin();

    $scope.open = function ($event) {
        $event.preventDefault();
        $event.stopPropagation();

        $scope.opened = true;
    };

    $scope.dateOptions = {
        formatYear: 'yyy',
        startingDay: 1
    };

    $scope.formats = ['dd-MM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
    $scope.format = $scope.formats[0];


    $scope.verOcupacion = function () {
        fecha1 = $filter('date')($scope.dt, $scope.format);
        fecha2 = $filter('date')($scope.dt2, $scope.format);

        Box.ocupacion($scope.selectedBox, fecha1, fecha2).success(function (data) {
            if (data == 0) {
                alertService.add('warning', 'No posee ocupación');
                type = 'warning';
            } else if (data < 25) {
                type = 'success';
            } else if (data < 50) {
                type = 'info';
            } else if (data < 75) {
                type = 'warning';
            } else {
                type = 'danger';
            }

            $scope.dynamic = data;
            $scope.type = type;
        });
    }
}]);