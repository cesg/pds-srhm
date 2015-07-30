<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<jsp:include page="_styles.jsp"/>

<title>SRHM</title>
</head>
<body>
  <jsp:include page="_nav_bar.jsp" />
  <div class="container">
    <ul class="nav nav nav-pills nav-stacked" style="width: 300px">
      <li><a class="btn btn-primary btn-lg btn-block"
        href="home_director.jsp">Acceder como director</a></li>
      <li><a class="btn btn-primary btn-lg btn-block"
        href="home_medico.jsp">Acceder como médico</a></li>
      <li><a class="btn btn-primary btn-lg btn-block"
        href="home_paciente.jsp">Acceder como paciente</a></li>
      <li><a href="home_rce.jsp">Ver RCE</a></li>
    </ul>


  </div>
  <jsp:include page="_footer.jsp"/>
</body>
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
  
</script>
</html>