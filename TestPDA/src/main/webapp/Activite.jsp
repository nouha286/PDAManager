<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Activité</title>
</head>
<body>

<h3>Ajouter une activité</h3>
  <form  method="POST" action="${pageContext.request.contextPath}/Activite">
    <table>

	<tr>
	 <td><label for="titre">Titre d'activité:</label></td>
        <td><input type="text" id="titre" name="titre"></td>
	</tr>
	
      <tr>
        <td><label for="dateDebut">Date de début d'activité:</label></td>
        <td><input type="date" id="dateDebut" name="dateDebut"></td>
      </tr>
      
      <tr>
        <td><label for="dateFin">Date de fin d'activité:</label></td>
        <td><input type="date" id="dateFin" name="dateFin"></td>
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
			  <c:forEach items="${AllResponsable}"  var="res" >
			  <option value="${res.id}">${res.nom } ${res.prenom }</option>
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
<h3>Liste des activités </h3>


    <table border="1">
    
    <thead>
     <tr>
     <th>titre</th>
        
           <th>type</th>
      
           <th>date de début</th>
       
           <th > date de fin</th>
            <th > Responsable</th>
       

                          <th colspan="2">operation</th>
             
  </tr>
    </thead>
    <tbody> 
   
   
    <c:forEach items="${AllActivites}"  var="ac" >
    
   
  
    
     <tr>
       <!--  -->
       <form method="POST" action="${pageContext.request.contextPath}/Activite">
       
               <td>${ ac.titre}</td>
          <td>${ ac.type}</td>
             <td>${ ac.dateDebutActivite}</td>
                <td>${ ac.dateFinActivite}</td>
                 <td>${ ac.responsable.nom}  ${ ac.responsable.prenom}</td>
                  
        
          
        
    
            <td><input type="submit" name="action" value="modRedirect"/></td>
            <td><input type="submit" name="action" value="supprimer"/></td>
                <input type="hidden" name="id" value="${ ac.id}"/>
               

          </form>
  
     </tr>
     </c:forEach>
     
     
     
     
     
     
     
     
     
     </tbody>
    
       
    </table>

</div>






<div>
<h3>Liste des activités désactivés </h3>


    <table border="1">
    
    <thead>
     <tr>
     <th>titre</th>
        
           <th>type</th>
      
           <th>date de début</th>
       
           <th > date de fin</th>
            <th > responsable</th>
       

                          <th colspan="2">operation</th>
             
  </tr>
    </thead>
    <tbody> 
   
   
    <c:forEach items="${AllActivitesDesactive}"  var="ac" >
    
   
  
    
     <tr>
       <!--  -->
       <form method="POST" action="${pageContext.request.contextPath}/Activite">
       
               <td>${ ac.titre}</td>
          <td>${ ac.type}</td>
             <td>${ ac.dateDebutActivite}</td>
                <td>${ ac.dateFinActivite}</td>
                 <td>${ ac.responsable.nom}  ${ ac.responsable.prenom}</td>
        
          
        
    
            <td><input type="submit" name="action" value="Activer"/></td>
           
                <input type="hidden" name="id" value="${ ac.id}"/>
               

          </form>
  
     </tr>
     </c:forEach>
     
     
     
     
     
     
     
     
     
     </tbody>
    
       
    </table>

</div>
 
</body>
</html>