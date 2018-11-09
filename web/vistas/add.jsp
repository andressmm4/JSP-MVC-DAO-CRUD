<%-- 
    Document   : add
    Created on : Nov 9, 2018, 8:34:55 AM
    Author     : Andres Montenegro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Agregar persona</h1>
        <a href="Controlador?accion=add">Agregar Nuevo</a>
        <div>
            <form action="Controlador" method="POST" enctype="multipart/form-data">
                <label for="txtDni">DNI &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
                <input type="text" id="txtDni" name="txtDni"><br><br>
                <label for="txtNomb">NOMBRE &nbsp</label>
                <input type="text" id="txtNomb" name="txtNomb"><br><br>
                <input type="submit" name="accion" value="Agregar">
            </form>
        </div>
        
    </body>
</html>
