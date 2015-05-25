//function showMensaje(text) {
//  $('#alert-msg').html(text);
//  $('.alert').show();
//}

function obtenerPacientes() {
  // $('#ver_usuarios').disable();

  var fecha1 = $('#datetimepicker1').val();
  var fecha2 = $('#datetimepicker2').val();

  if (fecha1.length < 1 || fecha2.length < 1) {
    showMensaje("No se ingreso la fecha se filtra por la fecha actual");
  }

  $.get('UsuariosReporte?fecha1=' + fecha1 + '&fecha2=' + fecha2,
      function(data) {
        $.each(data,
            function(i, item) {
              $('.table tr:last').after(
                  '<tr><td>' + item.nombre + '</td><td>' + item.uso
                      + '</td></tr>');
            });
      });
}