function obtenerPacientes() {
  $.get('PacienteList', function(data) {
    $.each(data, function(i, item) {
      $('#paciente_list').append($('<option>', {
        value : item.id,
        text : item.nombre
      }));
    });
  },'json');
}