<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<jsp:include page="_styles.jsp" />
<link rel="stylesheet" href="css/reporte.css">

<title>Reporte Box</title>
</head>
<body>
  <jsp:include page="_nav_bar.jsp">
    <jsp:param value="Director" name="rol" />
  </jsp:include>
  <section class="container">
    <h2>Reporte de ocupación de box</h2>

    <div class="row">
      <div class="col-md-8">
        <p class="text-muted">La ocupación de un box corresponde al
          promedio de horas medicas reservadas entres las fechas que se
          realizan en dicho box</p>
        <div id="seleccion" class="row">
          <label for="box_list">Lista de Box</label> <select
            id="box_list" class="form-control" style="width: 200px">
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


          <button id="ver_ocupacion" class="btn btn-info" type="submit">Ver
            Ocupación</button>
        </div>
        <jsp:include page="_msg.jsp" />
        <div class="row" id="resultado">
          <label>Porcentaje Ocupación</label>
          <div class="progress">
            <div class="progress-bar" role="progressbar"
              aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"
              style="width: 0%">0%</div>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <jsp:include page="_reporte_nav_pill.jsp">
          <jsp:param value="box" name="menu" />
        </jsp:include>
      </div>
    </div>


  </section>
  <jsp:include page="_scripts.jsp"></jsp:include>

  <script type="text/javascript">
      // Obtiene los box desde el servlet
      $.get("BoxList", function(data) {

        // recorre el array json
        $.each(data, function(i, box) {

          // agrega las opciones al select
          $('#box_list').append($('<option>', {
            value : box.id,
            text : box.descripcion
          }));
        });
      }, "json");

      // Obtiene la ocupacion del box
      $("#ver_ocupacion").click(
          function(e) {
            // obtiene el ID del box selecionado
            var boxId = $("#box_list").val();
            var fecha1 = $('#datetimepicker1').val();
            var fecha2 = $('#datetimepicker2').val();
            // Consulta la servlet por la ocupacion con el ID
            $.get("BoxOcupacion?boxId=" + boxId + '&fecha1=' + fecha1
                + '&fecha2=' + fecha2, function(data) {
              if (data == 0) {
                showMensaje("El Box no posee reservas en la fecha indicada");
              } else if (data < 31) {
                $('.progress-bar').addClass('progress-bar-info');
              } else if (data > 31 && data < 51) {
                $('.progress-bar').addClass('progress-bar-success');
              } else if (data > 51) {
                $('.progress-bar').addClass('progress-bar-danger');
              }
              $('.progress-bar').html(data + "%");
              $('.progress-bar').css('width', data + '%').attr('aria-valuenow',
                  data);
            });
          });
    </script>
  <script type="text/javascript">
      $('#datetimepicker1').datetimepicker({
        format : 'd-m-Y H:i'
      });

      $('#datetimepicker2').datetimepicker({
        format : 'd-m-Y H:i'
      });
    </script>
  <jsp:include page="_footer.jsp" />
</body>

</html>