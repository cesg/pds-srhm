//function showMensaje(text) {
//  $('#alert-msg').html(text);
//  $('.alert').show();
//}

function obtenerMedicos() {

  var fecha1 = $('#datetimepicker1').val();
  var fecha2 = $('#datetimepicker2').val();

  if (fecha1.length < 1 || fecha2.length < 1) {
    showMensaje("No se ingreso la fecha se filtra por la fecha actual");
  }

  $
      .get(
          'MedicosReporte?fecha1=' + fecha1 + '&fecha2=' + fecha2,
          function(data) {
            $
                .each(
                    data,
                    function(i, item) {
                      var bar = "<div class='progress'><div class='progress-bar' role='progressbar' aria-valuenow='"
                          + item.ocupacion
                          + "' aria-valuemin='0' aria-valuemax='100' style=width:"
                          + item.ocupacion
                          + "%>"
                          + item.ocupacion
                          + "%</div></div>";
                      $('.table tr:last').after(
                          '<tr><td>' + item.nombre + '</td><td>' + bar
                              + '</td></tr>');
                    });
          });
}