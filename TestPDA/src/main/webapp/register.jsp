<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- <%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getLocalPort() + path + "/";
%> --%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Page d'inscription</title>
</head>

<body>
<h2>Inscrire</h2>
<hr/>
<form method="POST" action="${pageContext.request.contextPath }/register">
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
            <td><label for="login">Entrez Votre userName:</label></td>
            <td><input type="text" name="login" id="login"/></td>
        </tr>
        <tr>
            <td><label for="tele">Entrez Votre email:</label></td>
            <td><input type="text" name="tele" id="tele"/></td>
        </tr>
        <tr>
            <td><label for="password">Entrez Votre password:</label></td>
            <td><input type="password" name="password" id="password"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Inscrire"/></td>
        </tr>
    </table>
</form>
</body>