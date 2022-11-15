<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Modifier un participant</h3>
<form method="POST" action="${pageContext.request.contextPath}/participant">
    <table>
        <tr>
            <td><label for="nom">Entrez Votre nom:</label></td>
            <td><input type="text" name="nom" id="nom" value="${Participant.nom }"/></td>
        </tr>
        <tr>
            <td><label for="prenom">Entrez votre prenom:</label></td>
            <td><input type="text" name="prenom" id="prenom"  value="${Participant.prenom }"/></td>
        </tr>
        <tr>
            <td><label for="tele">Entrez Votre numero de telephone:</label></td>
            <td><input type="text" name="tele" id="tele"  value="${Participant.tele }"/></td>
        </tr>
       
        <tr>
            <td><label for="email">Entrez Votre email:</label></td>
            <td><input type="text" name="email" id="email"  value="${Participant.email }"/></td>
        </tr>
        <tr>
            <td><label for="domaine">Entrez Votre domaine:</label></td>
            <td><input type="text" name="domaine" id="domaine"  value="${Participant.domaine }"/></td>
        </tr>
        <tr>
            <td><label for="structure">Entrez Votre structure:</label></td>
            <td><input type="text" name="structure" id="structure"  value="${Participant.structure }"/></td>
            <input type="hidden" name="id" id="id"  value="${Participant.id }"/>
        </tr>
        <tr>
         <tr>
        <td> Séléctionner l'activité:</td>
         <c:forEach items="${AllActivites}"  var="pa" >
        <td><label for="activite"> </label></td>
        <td><input type="checkbox" id="activite" name="activite" value="${pa.id}">${pa.titre}</td>
          </c:forEach>

        </tr>
        
            <td colspan="2"><input name="action" type="submit" value="modifier"/></td>
        </tr>
    </table>
</form>
</body>
</html>