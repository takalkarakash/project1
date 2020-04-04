<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/displayMedicalData.css">
<meta charset="ISO-8859-1">
<title>Saved Data</title>
</head>
<body>
<h2>Stored Medical Data</h2>
<table id="customers">
<tr>
	<th>ID</th>
	<th>Type Of Medicine</th>
	<th>Medical-Name</th>
	<th>Price</th>
	<th>Manufactured-By</th>
	<th>Date Of Expiry</th>
	<th>Delete</th>
	<th>Edit</th>
</tr>	
<tr>
	<c:forEach items="${listOfLocations}" var="location">
	<tr>
		<td>${location.id}</td>
		<td>${location.typeOfMedicine}</td>
		<td>${location.medicine_name}</td>
		<td>${location.price}</td>
		<td>${location.manufacturer}</td>
		<td>${location.date_of_expiry}</td>
		<td><a href="deleteMedicalData?id=${location.id}">Delete</a></td>
		
		<td><a href="editMedicalData?id=${location.id}">Edit</a></td>
	</tr>
	</c:forEach>
</tr>
<br>


</table>
<br><br><br>
<a href="medicaldata" id="location">Click here to add some more medicals</a>

</body>
</html>