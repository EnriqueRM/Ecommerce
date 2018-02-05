<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Calculo"  method="post">
<p>Unidades</p>
<input type="text" name="unidades">

<p>Ciudades:</p>
<select id="ciudades" name="ciudades">
  <option value="Madrid">Madrid</option>
  <option value="Barcelona">Barcelona</option>
  <option value="Zaragoza">Zaragoza</option>
</select>

<input type="submit" value="Aceptar">
</form>
<a href="Calculo?codigo=123">Enlace 123</a>
</body>
</html>