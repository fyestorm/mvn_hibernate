<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style> 
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
    background-color: lightgrey;
    color: grey;
}
</style>
 <ul>
  <li><a href="index">Liste des Articles</a></li>
  <li><a href="CreationArticle">Creation d'Article</a></li>
  <li><a href="CreationCategorie">Creation de Catégorie</a></li>
  <li><a href="ListCategorie">Liste des Catégories</a></li>
</ul> 
