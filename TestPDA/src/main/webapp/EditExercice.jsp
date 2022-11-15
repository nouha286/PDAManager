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

<h3>Modifier un exercice</h3>
  <form  method="POST" action="${pageContext.request.contextPath}/Exercice">
    <table>

	<tr>
	 <td><label for="annee">Année d'exercice:</label></td>
        <td><input name="annee" type="number" min="1900" max="2099" step="1" value="${Exercice.annee }" /></td>
	</tr>
	
      <tr>
        <td><label for="dateDebut">Date de début  d'exercice:</label></td>
        <td><input type="date" id="dateDebut" name="dateDebut" value="${Exercice.dateDebut }"></td>
      </tr>
      
      <tr>
        <td><label for="dateFin">Date de fin  d'exercice:</label></td>
        <td><input type="date" id="dateFin" name="dateFin" value="${Exercice.dateFin }"></td>
      </tr>
     <tr>
            <td> <input type="hidden" name="id"   value="${Exercice.id }"/></td>
      </tr>
      
      <tr>
       <td><label for="Status">Status d'activité:</label></td>
	      <td>
			 <select name="Status" id="type">
			  <option value="encours">encours</option>
			  <option value="terminé">termine</option>
			</select>
		</td>
      </tr>
        
      <tr>
      
       <td><label for="type">Séléctionner une activité:</label></td>
       
	      <td>
			 <select name="id_activite" id="id_activite">
			  <c:forEach items="${AllActivites}"  var="act" >
			  <option value="${act.id}">${act.titre }</option>
			 </c:forEach>
			</select>
		</td>
		
      </tr>
       
       
      <tr>
            <td colspan="2"><input name="action" type="submit" value="modifier"/></td>
        </tr>
        
        
    </table>
 </form>
 
 
 
 
</body>
</html>