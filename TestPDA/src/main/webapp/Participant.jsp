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
<h3>Ajouter un participant</h3>
<form method="POST" action="${pageContext.request.contextPath}/participant">
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
            <td><label for="email">Entrez Votre email:</label></td>
            <td><input type="text" name="email" id="email"/></td>
        </tr>
        <tr>
            <td><label for="domaine">Entrez Votre domaine:</label></td>
            <td><input type="text" name="domaine" id="domaine"/></td>
        </tr>
        <tr>
            <td><label for="structure">Entrez Votre structure:</label></td>
            <td><input type="text" name="structure" id="structure"/></td>
        </tr>
        <tr>
        <td> Séléctionner l'activité:</td>
         <c:forEach items="${AllActivites}"  var="pa" >
        <td><label for="activite"> </label></td>
        <td><input type="checkbox" id="activite" name="activite" value="${pa.id}">${pa.titre}</td>
          </c:forEach>

        </tr>
        <tr>
            <td colspan="2"><input name="action" type="submit" value="ajouter"/></td>
        </tr>
    </table>
</form>
</div>





<div>
<h3>Liste des participants </h3>


    <table border="1">
    
    <thead>
     <tr>
     <th>Nom</th>
        
           <th>Prenom</th>
      
           <th>N° telephone</th>
       
           <th > email</th>
       
            <th>domaine</th>
       
             <th>structure</th>
             <th>activité</th>
                          <th colspan="2">operation</th>
             
  </tr>
    </thead>
    <tbody> 
  
   
    <c:forEach items="${AllParticipants}"  var="pa" >
    
   
  
    
     <tr>
       <!--  -->
       <form method="POST" action="${pageContext.request.contextPath}/participant">
       
               <td>${ pa.nom}</td>
          <td>${ pa.prenom}</td>
             <td>${ pa.tele}</td>
                <td>${ pa.email}</td>
                   <td>${ pa.domaine}</td>
                      <td>${ pa.structure}</td>
                       <td> <c:forEach var="i" begin="0" end="${pa.activites.size() }" step="1">
    -${ pa.activites[i].titre}
</c:forEach></td>
        
          
        
    
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
<h3>Liste des participants désactivés </h3>


    <table border="1">
    
    <thead>
     <tr>
     <th>Nom</th>
        
           <th>Prenom</th>
      
           <th>N° telephone</th>
       
           <th > email</th>
       
            <th>domaine</th>
       
             <th>structure</th>
                          <th colspan="2">operation</th>
             
  </tr>
    </thead>
    <tbody> 
   
   
    <c:forEach items="${AllParticipantsDesactive}"  var="pa" >
    
   
  
    
     <tr>
       <!--  -->
       <form method="POST" action="${pageContext.request.contextPath}/participant">
       
               <td>${ pa.nom}</td>
          <td>${ pa.prenom}</td>
             <td>${ pa.tele}</td>
                <td>${ pa.email}</td>
                   <td>${ pa.domaine}</td>
                      <td>${ pa.structure}</td>
        
          
        
    
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