function obtenerEspecialidades() {
  $.get("EspecialidadList", function(data) {
    $.each(data, function(i, box) {
      $('#especialidad_list').append($('<option>', {
        value : box.id,
        text : box.nombre
      }));
    });
  }, "json");
}