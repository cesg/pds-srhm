//function showMensaje(text) {
//  $('#alert-msg').html(text);
//  $('.alert').show();
//}

function obtenerMedicos(especialidadId) {
  $.get("MedicoList?especialidadId=" + especialidadId, function(data) {
    $('#medico_list option[value!="0"]').remove();
    if (data.length < 1) {
      showMensaje('No encontraron médicos para la especialidad');
    }
    $.each(data, function(i, medico) {
      $('#medico_list').append($('<option>', {
        value : medico.id,
        text : medico.nombre
      }));
    });

  }, "json");
}