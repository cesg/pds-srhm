function obtenerHorasMed(medicoId, fecha1, fecha2) {
  $.get('HoraMedicaList?medicoId=' + medicoId + '&fecha1=' + fecha1
      + '&fecha2=' + fecha2, function(data) {

    $(".table tbody tr td").remove();

    $.each(data, function(i, item) {
      
      $('.table tr:last').after(
          '<tr><td>' + item.medicoNombre + '</td><td>' + item.boxDescripcion
              + '</td><td>' + item.fecha
              + '</td><td><button class="btn btn-success reserva" value="'
              + item.id + '">Reservar</button></td></tr>');
    });
    
    $('.reserva').bind('click', function(e) {
      var pacienteId = $("#paciente_list").val();
      var horaMedicaId = e.target.value;
      reservarHoraMed(horaMedicaId, pacienteId);
    });
  });
}

function obtenerHorasDeMed(medicoId, fecha1, fecha2) {
  $.get('MedicoDisponibilidad?medicoId=' + medicoId + '&fecha1=' + fecha1
      + '&fecha2=' + fecha2, function(data) {

    $(".table tbody tr td").remove();

    $.each(data, function(i, item) {
      
      $('.table tr:last').after(
          '<tr><td>' + item.medicoNombre + '</td><td>' + item.boxDescripcion
              + '</td><td>' + item.fecha
              + '</td><td><input name="reserva" type="checkbox" class="reserva" value="'
              + item.id + '"/></td></tr>');
    });
    
//    $('.reserva').bind('click', function(e) {
//      var pacienteId = $("#paciente_list").val();
//      var horaMedicaId = e.target.value;
//      reservarHoraMed(horaMedicaId, pacienteId);
//    });
  });
}

function reservarHoraMed(horaMedId, pacienteId) {
  $.post('HoraMedicaReservar', {
    horaMedicaId : horaMedId,
    pacienteId : pacienteId
  }).done(function(data) {
    $(".table tbody tr td").remove();
    $('#ver_horas').prop('disabled', false);
  });
}

function reservarHoraMedControl(horaMedIds, pacienteId) {
  $.post('MedicoReservarControl', {
    horasIds : horaMedIds,
    pacienteId : pacienteId
  }).done(function(data) {
    $(".table tbody tr td").remove();
    $('#ver_horas').prop('disabled', false);
  });
}