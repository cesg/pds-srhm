<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <jsp:include page="_styles.jsp"/>

  <title>SRHM</title>
</head>
<body ng-app="SrhmApp">

<jsp:include page="_nav_bar.jsp">
  <jsp:param value="Director" name="rol" />
</jsp:include>

<section class="container" ng-controller="RceCtr">
  <input
      ng-model="pacienteFind"
      ng-change="buscarPaciente(pacienteFind)"
      type="text"/>
  <div>
    <div class="list-group">
      <button type="button" class="list-group-item" ng-repeat="paciente in pacientes" ng-click="selecionaPaciente($index)" >
        {{ paciente.display }}
      </button>
    </div>
    <div>
      {{ pacienteSelect.display }}
    </div>
    
    <button ng-click="buscarEncuentros()">Buscar RCE</button>

  </div>
  <div>
    <ul class="list-group">
      <li class="list-group-item" ng-repeat="encuentro in encuentros">
        {{ encuentro.display }}
      </li>
    </ul>
  </div>
</section>

<jsp:include page="_footer.jsp"/>
</body>
<jsp:include page="_scripts.jsp"></jsp:include>
<script>
  app.factory('RceService', ['$http', function ($http) {
    return {
      search : function (text) {
        return $http.get('PacienteBuscar?q='+ text);
      },
      searchEncuentros : function(paciente) {
        return $http.get('HoraMedicaPaciente?id='+ paciente);
      }
    }
  }]);

  app.controller('RceCtr', ['$scope', 'RceService',function ($scope, Rce) {
    $scope.pacientes = [];
	
    $scope.buscarPaciente = function (text) {
      if (text.length > 3) {
        Rce.search(text).success(function (data) {
          $scope.pacientes = data.results;
        });
      }
    }
    
    $scope.selecionaPaciente = function (index) {
      $scope.pacienteSelect = $scope.pacientes[index];
      console.log(index);
    }
    
    $scope.buscarEncuentros = function() {
      Rce.searchEncuentros($scope.pacienteSelect.uuid).success(function(data){
        $scope.encuentros = data.results;
      });
      console.log("Buscando encuentros de uuid "+ $scope.pacienteSelect.uuid );
    }
  }]);
</script>
</html>
