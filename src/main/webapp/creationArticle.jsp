<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Création d'article</title>
</head>
<body>
	<form action="Creation" method="post">
		Designation : <input type="text" name="designation" /> 
		<br />

		Catégories : <select name="dangerous">
			<option value="aucune">aucune</option>
			<c:forEach items="${categories}" var="categorie">
				<option value="${categorie.nom}">${categorie.nom}</option>
			</c:forEach>
		</select>
		<br/>
		Nbr Points : <input type="text" name="nbPoints" /> 
		<br/>
		Stock : <input type="text" name="stock" /> 
		<br/> 
		<br/>

		<button type="submit">Créer</button>
	</form>

</body>
</html>