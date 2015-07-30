<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Reporte Medico</title>
<jsp:include page="_styles.jsp" />
<link rel="stylesheet" href="css/reporte.css">

</head>
<body ng-app="SrhmApp">
  <jsp:include page="_nav_bar.jsp">
    <jsp:param value="Director" name="rol" />
  </jsp:include>
  <section class="container" ng-controller="ReporteMedCtr">
    <h2>Reporte de ocupación de médico</h2>
    <div class="row margen">
      <div class="col-md-8">
        <p class="text-muted">La ocupación de un médico corresponde
          al promedio de horas medicas reservadas entres las fechas que
          se realiza el médico seleccionado</p>
        <div id="seleccion" class="row">
          <label for="especialidad_list">Lista especialidades</label>
          <select
              ng-model="especialidadSelect"
              ng-options="especialidad.nombre for especialidad in especialidades"
              ng-change="buscarMedicos(especialidadSelect)"
            id="especialidad_list" class="form-control"
            style="width: 200px">
          </select>
        </div>

        <div class="row margen">
          <label for="medico_list">Médicos de la especialidad</label>
          <select
              ng-model="medicoSelect"
              ng-options="medico.nombre for medico in medicos"
            id="medico_list"
            class="form-control"
            style="width: 200px">
          </select>
          <div class="row margen">
            <p class="text-primary">Puede indicar el rango de fechas
              a analizar. Si no se indica se analiza dentro de 24hrs</p>
            <div class="col-md-6">
              <label for="datetimepicker1">Fecha inicio</label> <input
                id="datetimepicker1" type="text">
            </div>
            <div class="col-md-6">
              <label for="datetimepicker2">Fecha termino</label> <input
                id="datetimepicker2" type="text">
            </div>

          </div>
          <button id="ver_ocupacion" class="btn btn-info margen"
            type="submit">Ver ocupación</button>
        </div>
        <div class="row">

          <jsp:include page="_msg.jsp" />

          <div class="progress">
            <div class="progress-bar progress-bar-info"
              role="progressbar" aria-valuenow="0" aria-valuemin="0"
              aria-valuemax="100" style="width: 0%">0%</div>
          </div>
        </div>
      </div>


      <div class="col-md-4">
        <jsp:include page="_reporte_nav_pill.jsp">
          <jsp:param value="medico" name="menu" />
        </jsp:include>
      </div>
    </div>


  </section>

  <jsp:include page="_scripts.jsp"></jsp:include>
  <script type="text/javascript" charset="UTF-8">
    app.factory('EspecialidadService', ['$http', function ($http) {
      return {
        all : function () {
          return $http.get('EspecialidadList');
        },
        medicos : function (especialidad) {
          return $http.get('MedicoList?especialidadId='+ especialidad);
        }
      }
    }]);
    app.controller('ReporteMedCtr', ['$scope','EspecialidadService', function ($scope, Especialidad) {
      $scope.especialidades = [];
      $scope.medicos = [];

      Especialidad.all().success(function (data) {
        console.log(data);
        $scope.especialidades = data;
      });

      $scope.buscarMedicos = function (especialidad) {
        Especialidad.medicos(especialidad.id).success(function (data) {
          $scope.medicos = data;
        })
        console.log(especialidad.id);
      }


    }]);
  </script>
  <script type="text/javascript">
      $('#datetimepicker1').datetimepicker({
        format : 'Y-m-d H:i'
      });

      $('#datetimepicker2').datetimepicker({
        format : 'Y-m-d H:i'
      });
    </script>
  <jsp:include page="_footer.jsp" />
</body>
</html>