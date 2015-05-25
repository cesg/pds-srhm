
<%
	String menu = request.getParameter("menu");
%>

<ul class="nav nav-pills nav-stacked">
  <li role="presentation" class='<%=  menu.equals("box")? "active":"" %>'><a
    href="reporte_box.jsp">Ocupación Box</a></li>
  <li role="presentation" class='<%=  menu.equals("medico")? "active":"" %>'><a
    href="reporte_medico.jsp">Ocupación Médico</a></li>
  <li role="presentation" class='<%=  menu.equals("rankmedicos")? "active":"" %>'><a
    href="reporte_rank_medicos.jsp">Médicos más solicitados</a></li>
  <li role="presentation" class='<%=  menu.equals("rankusuarios")? "active":"" %>'>
    <a href="reporte_usuarios.jsp">Pacientes más reservas</a>
  </li>
</ul>