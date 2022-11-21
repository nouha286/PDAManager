<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<div>
<h3>Ajouter un responsable</h3>
<form method="POST" action="${pageContext.request.contextPath}/Responsable">
    <table>
        <tr>
            <td><label for="nom">Entrez Votre nom:</label></td>
            <td><input type="text" name="nom" id="nom"/></td>
        </tr>
        <tr>
            <td><label for="prenom">Entrez votre prenom:</label></td>
            <td><input type="text" name="prenom" id="prenom"/></td>
        </tr>
        <tr>
            <td><label for="tele">Entrez Votre numero de telephone:</label></td>
            <td><input type="text" name="tele" id="tele"/></td>
        </tr>
       
       
        <tr>
            <td><label for="domaine">Entrez Votre domaine:</label></td>
            <td><input type="text" name="domaine" id="domaine"/></td>
        </tr>
        <tr>
            <td><label for="type">Séléctionner le type:</label></td>
            
             <td>
			 <select name="Type" id="type">
			  <option value="intervenant">intervenant</option>
			  <option value="formateur">formateur</option>
			 
			</select>
		</td>
        </tr>
        <tr>
            <td colspan="2"><input name="action" type="submit" value="ajouter"/></td>
        </tr>
    </table>
</form>
</div>





<div>
<h3>Liste des responsables </h3>


    <table border="1">
    
    <thead>
     <tr>
     <th>Nom</th>
        
           <th>Prenom</th>
      
           <th>N° telephone</th>
       
           
       
            <th>domaine</th>
       
             <th>type</th>
                          <th colspan="2">operation</th>
             
  </tr>
    </thead>
    <tbody> 
   
   
    <c:forEach items="${AllResponsable}"  var="pa" >
    
   
  
    
     <tr>
       <!--  -->
       <form method="POST" action="${pageContext.request.contextPath}/Responsable">
       
               <td>${ pa.nom}</td>
          <td>${ pa.prenom}</td>
             <td>${ pa.tele}</td>
             
                   <td>${ pa.domaine}</td>
                      <td>${ pa.type}</td>
        
          
        
    
            <td><input type="submit" name="action" value="modRedirect"/></td>
            <td><input type="submit" name="action" value="supprimer"/></td>
                <input type="hidden" name="id" value="${ pa.id}"/>
               

          </form>
  
     </tr>
     </c:forEach>
     
     
     
     
     
     
     
     
     
     </tbody>
    
       
    </table>

</div>






<div>
<h3>Liste des responsable désactivés </h3>


    <table border="1">
    
    <thead>
     <tr>
     <th>Nom</th>
        
           <th>Prenom</th>
      
           <th>N° telephone</th>
       
          
       
            <th>domaine</th>
       
             <th>type</th>
                          <th colspan="2">operation</th>
             
  </tr>
    </thead>
    <tbody> 
   
   
    <c:forEach items="${AllResponsablesDesactive}"  var="pa" >
    
   
  
    
     <tr>
       <!--  -->
       <form method="POST" action="${pageContext.request.contextPath}/Responsable">
       
               <td>${ pa.nom}</td>
          <td>${ pa.prenom}</td>
             <td>${ pa.tele}</td>
              
                   <td>${ pa.domaine}</td>
                      <td>${ pa.type}</td>
        
          
        
    
            <td><input type="submit" name="action" value="Activer"/></td>
           
                <input type="hidden" name="id" value="${ pa.id}"/>
               

          </form>
  
     </tr>
     </c:forEach>
     
     
     
     
     
    
     
     
     
     </tbody>
    
       
    </table>

</div>




</body>
</html>