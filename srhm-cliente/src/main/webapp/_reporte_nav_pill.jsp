
<%
	String menu = request.getParameter("menu");
%>

<ul class="nav nav-pills nav-stacked">
  <li role="presentation" class='<%=  menu.equals("box")? "active":"" %>'><a
    href="reporte_box.jsp">Ocupaci�n Box</a></li>
  <li role="presentation" class='<%=  menu.equals("medico")? "active":"" %>'><a
    href="reporte_medico.jsp">Ocupaci�n M�dico</a></li>
  <li role="presentation" class='<%=  menu.equals("rankmedicos")? "active":"" %>'><a
    href="reporte_rank_medicos.jsp">M�dicos m�s solicitados</a></li>
  <li role="presentation" class='<%=  menu.equals("rankusuarios")? "active":"" %>'>
    <a href="reporte_usuarios.jsp">Pacientes m�s reservas</a>
  </li>
</ul>