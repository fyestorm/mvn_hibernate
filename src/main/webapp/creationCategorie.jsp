<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cr�ation d'une cat�gorie</title>
</head>
<body>
<c:import url="header.jsp"></c:import>
	<form action="CreationCategorie" method="post">
		Nom : <input type="text" name="nom" /> 
		<button type="submit">Cr�er</button>
	</form>

</body>
</html>