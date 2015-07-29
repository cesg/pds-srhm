angular.module('boxService', []).factory('Box', function ($http) {
    return {
        all: function () {
            return $http.get('BoxList');
        },
        ocupacion : function (boxID, fecha1, fecha2) {
            return $http.get("BoxOcupacion?boxId=" + boxID + '&fecha1=' + fecha1+ '&fecha2=' + fecha2);
        }
    }
});