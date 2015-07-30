//var app = angular.module('SrhmApp', ['angular-loading-bar', 'ui.bootstrap', 'alertService']);

app.factory('BoxService', function ($http) {
    return {
        all: function () {
            return $http.get('BoxList');
        },
        ocupacion : function (boxID, fecha1, fecha2) {
            return $http.get("BoxOcupacion?boxId=" + boxID + '&fecha1=' + fecha1+ '&fecha2=' + fecha2);
        }
    }
});