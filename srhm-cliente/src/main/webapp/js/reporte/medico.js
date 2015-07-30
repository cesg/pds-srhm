//function showMensaje(text) {
//  $('#alert-msg').html(text);
//  $('.alert').show();
//}

$.get("EspecialidadList", function (data) {
    $.each(data, function (i, box) {
        $('#especialidad_list').append($('<option>', {
            value: box.id,
            text: box.nombre
        }));
    });
}, "json");

$("#ver_medicos").click(function (e) {
    var especialidadId = $("#especialidad_list").val();
    $.get("MedicoList?especialidadId=" + especialidadId, function (data) {
        $('#medico_list option[value!="0"]').remove();
        if (data.length < 1) {
            showMensaje('No encontraron médicos para la especialidad');
        }
        $.each(data, function (i, medico) {
            $('#medico_list').append($('<option>', {
                value: medico.id,
                text: medico.nombre
            }));
        });

    }, "json");
});

$("#ver_ocupacion")
    .click(
    function (e) {
        var medicoId = $("#medico_list").val();
        var fecha1 = $('#datetimepicker1').val();
        var fecha2 = $('#datetimepicker2').val();

        if (medicoId == null) {
            showMensaje('Debe selecionar un médico');
        } else {

            $
                .get(
                "MedicoOcupacion?medicoId=" + medicoId + '&fecha1='
                + fecha1 + '&fecha2=' + fecha2,
                function (data) {

                    if (data == 0) {

                        showMensaje('El médico selecionado no posee reservas registradas en entre las fechas');
                    }

                    $('.progress-bar').html(data + "%");
                    $('.progress-bar').css('width', data + '%').attr(
                        'aria-valuenow', data);
                });

        }

    });
