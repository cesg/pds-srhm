<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<jsp:include page="_styles.jsp" />
<link rel="stylesheet" href="css/reporte.css">
<title>Reporte usuarios</title>

</head>
<body>
  <jsp:include page="_nav_bar.jsp">
    <jsp:param value="Director" name="rol" />
  </jsp:include>

  <section class="container">
    <h2>Reporte de pacientes con más reservas</h2>
    <div class="row">
      <div class="col-md-8">
        <div class="row margen">
          <p class="text-primary">Puede indicar el rango de fechas a
            analizar. Si no se indica se analiza dentro de 24hrs</p>
          <div class="col-md-6">
            <label for="datetimepicker1">Fecha inicio</label> <input
              id="datetimepicker1" type="text">
          </div>
          <div class="col-md-6">
            <label for="datetimepicker2">Fecha termino</label> <input
              id="datetimepicker2" type="text">
          </div>
          <button id="ver_usuarios" class="btn btn-info margen"
            type="submit">Consultar usuarios</button>
        </div>
        <jsp:include page="_msg.jsp" />
        <div class="row">
          <table class="table">

            <tbody>
              <tr>
                <th>Nombre</th>
                <th>Porcentaje</th>
              </tr>
            </tbody>
          </table>
        </div>
      </div>

      <div class="col-md-4">

        <jsp:include page="_reporte_nav_pill.jsp">
          <jsp:param value="rankusuarios" name="menu" />
        </jsp:include>
      </div>
    </div>

  </section>
  <jsp:include page="_footer.jsp" />
</body>
<jsp:include page="_scripts.jsp"></jsp:include>
<script src="js/reporte/usuarios.js">
  
</script>
<script type="text/javascript">
  $('#datetimepicker1').datetimepicker({
    format : 'Y-m-d H:i'
  });

  $('#datetimepicker2').datetimepicker({
    format : 'Y-m-d H:i'
  });

  $('#ver_usuarios').click(function(e) {
    obtenerPacientes();
  });
</script>
</html>