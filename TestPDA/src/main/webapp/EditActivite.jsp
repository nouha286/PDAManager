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

<h3>Modifier une activité</h3>
<form method="POST" action="${pageContext.request.contextPath}/Activite">
    <table>
      <tr>
	 <td><label for="titre">Titre d'activité:</label></td>
        <td><input type="text" id="titre" name="titre" value="${Activite.titre }"></td>
	</tr>
	
      <tr>
        <td><label for="dateDebut">Date de début d'activité:</label></td>
        <td><input type="date" id="dateDebut" name="dateDebut" value="${Activite.dateDebutActivite }"></td>
      </tr>
      
      <tr>
        <td><label for="dateFin">Date de fin d'activité:</label></td>
        <td><input type="date" id="dateFin" name="dateFin" value="${Activite.dateFinActivite }"></td>
      </tr>
      
      <tr>
       <td><label for="type">Type d'activité:</label></td>
	      <td>
			 <select name="Type" id="type">
			  <option value="Formation">Formation</option>
			  <option value="Talk">Talk</option>
			  <option value="Événement">Événement</option>
			</select>
		</td>
      </tr>
       <tr>
      
       <td><label for="type">Séléctionner un responsable:</label></td>
       
	      <td>
	      
			 <select name="responsable" id="type">
			  <c:forEach items="${Responsable}"  var="res" >
			  <option value="${res.id}">${res.nom } ${res.prenom }</option>
			 </c:forEach>
			</select>
		</td>
		
      </tr>
        <tr>
            <input type="hidden" name="id" id="id"  value="${Activite.id }"/>
        </tr>
        <tr>
        
            <td colspan="2"><input name="action" type="submit" value="modifier"/></td>
        </tr>
    </table>
</form>
</body>
</html>