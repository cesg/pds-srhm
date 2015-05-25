<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta HTTP-EQUIV="Pragma" CONTENT="no-cache">
<jsp:include page="_styles.jsp"/>
<link rel="stylesheet" href="css/reporte.css">

<title>Paciente - reserva hora APS</title>

</head>
<body>
  <jsp:include page="_nav_bar.jsp">
    <jsp:param value="Paciente" name="rol" />
  </jsp:include>

  <section class="container">
    <div class="row">
      <div class="col-md-8">
        <div id="seleccion" class="row">
          <div class="col-md-6">
            <label for="especialidad_list">Lista de especialidades</label>
            <select id="especialidad_list" class="form-control"
              style="width: 200px">
            </select>
            <button id="ver_medicos" class="btn btn-info margen"
              type="submit">Buscar médicos</button>

          </div>
          <div class="col-md-6">
            <label>Médicos</label> <label for="medico_list">Medicos de la especialidad</label> <select id="medico_list" class="form-control"
              style="width: 200px">
            </select>
          </div>

        </div>
      </div>

      <div class="col-md-4">
        <div class="row margen">
        <p class="text-primary">Puede indicar el rango de fechas a analizar. Si no se indica se analiza dentro de 24hrs</p>
          <div class="col-md-6">
            <label for="datetimepicker1">Fecha inicio</label> <input
              id="datetimepicker1" type="text">
          </div>
          <div class="col-md-6">
            <label for="datetimepicker2">Fecha termino</label> <input
              id="datetimepicker2" type="text">
          </div>

        </div>
      </div>
    </div>
    <div class="row">
      <button id="ver_horas" class="btn btn-info margen" type="submit">Buscar
        hora aps</button>
      <div class="row">
        <label for="paciente_list">Lista de pacientes
          registrados</label> <select id="paciente_list" class="form-control" style="width: 200px">
        </select>
      </div>
    </div>
    <jsp:include page="_msg.jsp"/>
    <div class="row">
      <table class="table">
        <tbody>
          <tr>
            <th>Médico</th>
            <th>Box</th>
            <th>Fecha</th>
          </tr>
        </tbody>
      </table>
    </div>

  </section>
<jsp:include page="_footer.jsp"/>
</body>
<jsp:include page="_scripts.jsp"></jsp:include>
<script src="js/reporte/especialidad.js"></script>
<script src="js/reporte/medicos.js"></script>
<script src="js/reporte/hora_medica.js"></script>
<script src="js/reporte/paciente.js"></script>
<script type="text/javascript">
  obtenerEspecialidades();
  obtenerPacientes();

  $('#datetimepicker1').datetimepicker({
    format : 'Y-m-d H:i'
  });

  
  $('#datetimepicker2').datetimepicker({
    format : 'Y-m-d H:i'
  });

  $('#ver_medicos').click(function(e) {
    var especialidadId = $("#especialidad_list").val();
    obtenerMedicos(especialidadId);
  });

  $('#ver_horas').click(function(e) {
    var medId = $("#medico_list").val();
    var fecha1 = $('#datetimepicker1').val();
    var fecha2 = $('#datetimepicker2').val();
//     $(this).prop('disabled', true);
    obtenerHorasMed(medId, fecha1, fecha2);
   
  });
  
</script>
</html>