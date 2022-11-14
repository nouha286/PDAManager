<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	 <td><label for="titre">Année d'exercice:</label></td>
        <td><input type="number" min="1900" max="2099" step="1" value="2022" /></td>
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
			  <option value="terminé">terminé</option>
			</select>
		</td>
      </tr>
        
      <tr>
      
       <td><label for="type">Séléctionner une activité:</label></td>
       
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


</body>
</html>