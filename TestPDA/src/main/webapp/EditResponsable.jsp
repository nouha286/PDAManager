<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Modifier un participant</h3>
<form method="POST" action="${pageContext.request.contextPath}/Responsable">
    <table>
        <tr>
            <td><label for="nom">Entrez Votre nom:</label></td>
            <td><input type="text" name="nom" id="nom" value="${Responsable.nom }"/></td>
        </tr>
        <tr>
            <td><label for="prenom">Entrez votre prenom:</label></td>
            <td><input type="text" name="prenom" id="prenom"  value="${Responsable.prenom }"/></td>
        </tr>
        <tr>
            <td><label for="tele">Entrez Votre numero de telephone:</label></td>
            <td><input type="text" name="tele" id="tele"  value="${Responsable.tele }"/></td>
        </tr>
       
       
        <tr>
            <td><label for="domaine">Entrez Votre domaine:</label></td>
            <td><input type="text" name="domaine" id="domaine"  value="${Responsable.domaine }"/></td>
        </tr>
        <tr>
            <tr>
            <td><label for="type">Séléctionner le type:</label></td>
            
             <td>
			 <select name="Type" id="type">
			  <option value="intervenant">intervenant</option>
			  <option value="formateur">formateur</option>
			 
			</select>
		</td><input type="hidden" name="id" id="id"  value="${Responsable.id }"/>
        </tr>
        <tr>
        
            <td colspan="2"><input name="action" type="submit" value="modifier"/></td>
        </tr>
    </table>
</form>
</body>
</html>