<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Article</title>
</head>
<body>
	<h2>Article</h2>
	<a href="index" style="text-decoration: none">Retour</a>
	<p>Categorie : <c:out value="${article.categorie.nom}"/></p>
	<p>Nom : <c:out value="${article.designation}"/></p>
	<p>Nb Points : <c:out value="${article.nbPoints}"/></p>
	<p>En stock : <c:out value="${article.stock}"/></p>
</body>
</html>