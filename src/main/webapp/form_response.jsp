<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario recibido</title>
</head>
<body>
<h1>Formulario recibido con exito</h1>
<p>
<strong>Nombre: </strong><%= request.getParameter("name")%> <br>
<strong>Telefono: </strong><%= request.getParameter("phone") %><br>
</p>
</body>
</html>