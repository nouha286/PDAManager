<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8"%>

<%-- <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "//" + request.getServerName() + ":" + request.getLocalPort() + path + "//"; 
%> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Search Page</title>
</head>
<body>
<h2>Search Page</h2>
<form method="post" action="${pageContext.request.contextPath }/search">

	<table>
		<tr>

			<td>Name Activite:</td>
			<td><input type="text" name="nameActivite" /></td>
			<tr><td colspan=2 align="center">
			<input  type="submit" name="submit" value="Search"></td></tr>
			<!-- <td>Category:</td>
			<td><select name="bookcategories">
				<option value="-1">-Select Category-</option>
				<option value="java">java</option>
				<option value="c">c</option>
				<option value="c++">c++</option>
				</select></td>
		<td><input type="submit" value="Search Book" /></td> -->
		</tr>
			</table>

</form>
</body>
</html>