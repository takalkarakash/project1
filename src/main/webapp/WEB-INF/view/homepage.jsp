<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<script src="js/password.js"></script>
<meta charset="ISO-8859-1">
<title>Home-Page</title>
<link rel="stylesheet" href="css/homepage.css">
</head>
<body background="medical.jpg">
<h1>Pharma Management</h1>
<br>
<div>
<h2>Login Here</h2>
<form action="doAction" method="post" onsubmit="return validateform()">

UserName: &nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="userName"><br>

UserPassword: <input type="password" name="passWord"><br><br>
<input type="submit" value="login">
</form>
</div>
<br>

</body>
</html>