<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<jsp:include page="_styles.jsp"/>
<title>Home - Director</title>
</head>
<body>
  <jsp:include page="_nav_bar.jsp">
    <jsp:param value="Director" name="rol" />
  </jsp:include>
  <section class="container">
    <div class="row">
      <div class="col-md-8">
      <p>Permite a los direcores del hospital San Carlos visualizar reportes</p>
      </div>

      <div class="col-md-4">
        <jsp:include page="_reporte_nav_pill.jsp">
          <jsp:param value="" name="menu" />
        </jsp:include>
      </div>

    </div>

  </section>
  <jsp:include page="_footer.jsp"/>
</body>
<jsp:include page="_scripts.jsp"></jsp:include>
<script src="js/jquery-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
  
</script>
</html>