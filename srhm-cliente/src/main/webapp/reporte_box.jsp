<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <jsp:include page="_styles.jsp"/>
    <link rel="stylesheet" href="css/reporte.css">

    <title>Reporte Box</title>
</head>
<body ng-app="SrhmApp">
<jsp:include page="_nav_bar.jsp">
    <jsp:param value="Director" name="rol"/>
</jsp:include>
<section class="container">
    <h2>Reporte de ocupación de box</h2>

    <div class="row">
        <div class="col-md-8" ng-controller="ReporteController">
            <p class="text-muted">La ocupación de un box corresponde al
                promedio de horas medicas reservadas entres las fechas que se
                realizan en dicho box</p>

            <div id="seleccion" class="row">
                <label for="box_list">Lista de Box</label>
                <select ng-model="selectedBox" ng-options="box.id as box.descripcion for box in boxes"
                        id="box_list" class="form-control" style="width: 200px">
                </select>

                <div class="row margen">
                    <p class="text-primary">Puede indicar el rango de fechas
                        a analizar. Si no se indica se analiza dentro de 24hrs</p>

                    <div class="col-md-6">
                        <p class="input-group">
                            <input type="text" class="form-control" datepicker-popup="{{format}}" ng-model="dt"
                                   is-open="opened" min-date="minDate"
                                   datepicker-options="dateOptions" date-disabled="disabled(date, mode)"
                                   ng-required="true" close-text="Close"/>
              <span class="input-group-btn">
                <button type="button" class="btn btn-default" ng-click="open($event)"><i
                        class="glyphicon glyphicon-calendar"></i></button>
              </span>
                        </p>
                        <%--<label for="datetimepicker1">Fecha inicio</label> <input--%>
                        <%--id="datetimepicker1" type="text" ng-model="fecha1">--%>
                    </div>
                    <div class="col-md-6">
                        <p class="input-group">
                            <input type="text" class="form-control" datepicker-popup="{{format}}" ng-model="dt2"
                                   is-open="opened" min-date="minDate"
                                   datepicker-options="dateOptions" date-disabled="disabled(date, mode)"
                                   ng-required="true" close-text="Close"/>
              <span class="input-group-btn">
                <button type="button" class="btn btn-default" ng-click="open($event)"><i
                        class="glyphicon glyphicon-calendar"></i></button>
              </span>
                        </p>
                        <%--<label for="datetimepicker2">Fecha termino</label> <input--%>
                            <%--id="datetimepicker2" type="text" ng-model="fecha2">--%>
                    </div>

                </div>


                <button id="ver_ocupacion" class="btn btn-info" type="submit" ng-click="verOcupacion()">Ver
                    Ocupación
                </button>

                <jsp:include page="_msg.jsp"/>
            </div>

            <%--<jsp:include page="_msg.jsp"/>--%>
            <div class="row" id="resultado">
                <label>Porcentaje Ocupación</label>

                <div class="progress">
                    <progressbar animate="false" max="max" value="dynamic" type="{{type}}"><b>{{dynamic}}%</b>
                    </progressbar>


                    <div class="progress-bar" role="progressbar"
                         aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"
                         style="width: 0%">0%
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <jsp:include page="_reporte_nav_pill.jsp">
                <jsp:param value="box" name="menu"/>
            </jsp:include>
        </div>
    </div>


</section>
<jsp:include page="_scripts.jsp"></jsp:include>

<script src="js/reporteController.js"></script>
<script src="js/alertService.js"></script>
<script type="text/javascript">

</script>
<script type="text/javascript">
    $('#datetimepicker1').datetimepicker({
        format: 'd-m-Y H:i'
    });

    $('#datetimepicker2').datetimepicker({
        format: 'd-m-Y H:i'
    });
</script>
<jsp:include page="_footer.jsp"/>
</body>

</html>