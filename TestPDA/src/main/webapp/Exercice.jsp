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

<h3>Ajouter un exercice</h3>
  <form  method="POST" action="${pageContext.request.contextPath}/Exercice">
    <table>

	<tr>
	 <td><label for="annee">Année d'exercice:</label></td>
        <td><input name="annee" type="number" min="1900" max="2099" step="1" value="2022" /></td>
	</tr>
	
      <tr>
        <td><label for="dateDebut">Date de début  d'exercice:</label></td>
        <td><input type="date" id="dateDebut" name="dateDebut"></td>
      </tr>
      
      <tr>
        <td><label for="dateFin">Date de fin  d'exercice:</label></td>
        <td><input type="date" id="dateFin" name="dateFin"></td>
      </tr>
    
      <tr>
       <td><label for="Status">Status d'activité:</label></td>
	      <td>
			 <select name="Status" id="type">
			  <option value="encours">encours</option>
			  <option value="termine">terminé</option>
			</select>
		</td>
      </tr>
        
      <tr>
      
       <td><label for="type">Séléctionner une activité:</label></td>
       
	      <td>
			 <select name="activite" id="type">
			  <c:forEach items="${AllActivites}"  var="act" >
			  <option value="${act.id}">${act.titre }</option>
			 </c:forEach>
			</select>
		</td>
		
      </tr>
       
      <tr>
            <td colspan="2"><input name="action" type="submit" value="ajouter"/></td>
        </tr>
    </table>
 </form>
 
 
 
 
 
 
 
 
 
<div>
<h3>Liste des exercices </h3>


    <table border="1">
    
    <thead>
     <tr>
     <th>Année d'exercice</th>
        
           <th>Date de début  d'exercice</th>
      
           <th>Date de fin  d'exercice</th>
       
           <th > Status d'exercice</th>
            <th > Activité</th>
       

                          <th colspan="2">operation</th>
             
  </tr>
    </thead>
    <tbody> 
   
   
    <c:forEach items="${AllExercice}"  var="ac" >
    
   
  
    
     <tr>
       <!--  -->
       <form method="POST" action="${pageContext.request.contextPath}/Exercice">
       
               <td>${ ac.annee}</td>
          <td>${ ac.dateDebut}</td>
             <td>${ ac.dateFin}</td>
                <td>${ ac.status}</td>
                 <td>${ ac.activite.titre} </td>
                  
        
          
        
    
            <td><input type="submit" name="action" value="modRedirect"/></td>
            <td><input type="submit" name="action" value="supprimer"/></td>
                <input type="hidden" name="id" value="${ ac.id}"/>
               

          </form>
  
     </tr>
     </c:forEach>
     
     
     
     
     
     
     
     
     
     </tbody>
    
       
    </table>

</div>


</body>
</html>