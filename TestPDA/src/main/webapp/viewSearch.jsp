<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
             
  </tr>
    </thead>
    <tbody> 
   
   
    <c:forEach items="${AllActiviti}"  var="pa" >
    
    
     <tr>
       <!--  -->
       <form method="POST" action="${pageContext.request.contextPath}/search">
       
         <td>${ pa.nom}</td>
          <td>${ pa.prenom}</td>
             <td>${ pa.tele}</td>
                <td>${ pa.email}</td>
                   <td>${ pa.domaine}</td>
                      <td>${ pa.structure}</td>
                  </form>
     </tr>
     </c:forEach>
     </tbody>   
    </table>
			
</body>
</html>
</html>