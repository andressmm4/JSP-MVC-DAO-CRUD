<%-- 
    Document   : listar
    Created on : Nov 9, 2018, 8:35:20 AM
    Author     : Andres Montenegro
--%>
<%@page import="Modelo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="content">
            <h1>Personas</h1>
            <table frame="void" rules="rows">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>DNI</th>
                        <th>NOMBRE</th>
                        <th>ACIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        PersonaDAO dao = new PersonaDAO();
                        List<Persona>list = dao.listar();
                        Iterator<Persona>iter = list.iterator();
                        Persona per = null;
                        while(iter.hasNext()){
                            per=iter.next();
                    %>
                    <tr>
                        <td><%=per.getId()%></td>
                        <td><%=per.getDni()%></td>
                        <td><%=per.getNomb()%></td>
                        <td>
                            <a href="#">Editar</a> /
                            <a href="#">eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
