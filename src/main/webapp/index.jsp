<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Liste des Articles</title>
</head>
<body>
<c:import url="header.jsp"></c:import>
	<h1>Liste des Articles</h1>
	<br />
	<a href="CreationArticle">Cr�ation</a>
	<br />
	<c:forEach var="article" items="${articles}">

		<a href="Article?id=${article.idArticle }"
			style="text-decoration: none; color: rgb(109, 19, 59); font-size: 30px;">${article.designation}
			(${article.categorie.nom}) </a>
		<br />
	</c:forEach>
	<br />
	<p>Nombre total d'article(s): ${articles.size()}</p>
</body>
</html>
