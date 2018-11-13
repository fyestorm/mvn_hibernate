<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Liste des Categories</title>
</head>
<body>
<c:import url="header.jsp"></c:import>
	<c:forEach var="categorie" items="${categories}">

		<h3><a href="ArticleByCategorie?id=${categorie.idCategorie}" style="text-decoration: none;color: black">La catégorie :${categorie.nom}</a></h3>

	</c:forEach>

</body>
</html>