<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/update.css">
<meta charset="ISO-8859-1">
<title>Update your data</title>
</head>
<body>
<h2>Update your Existing Data</h2>
<div id="container">
<form action="updateMedical" method="post" readonly="readonly">
Id<input type="text" name="id" value="${location.id}"><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Type Of Medicine:Injection <input type="radio" name="typeOfMedicine" value="Injection" ${location.typeOfMedicine=='Injection'?'checked': ''}>
Syrup <input type="radio" name="typeOfMedicine" value="Syrup" ${location.typeOfMedicine=='Syrup'?'checked': ''}>
Tablet <input type="radio" name="typeOfMedicine" value="Tablet" ${location.typeOfMedicine=='Tablet'?'checked': ''}><br>
Medical-Name:<input type="text" name="medicine_name" value="${location.medicine_name}"><br>
Price: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="text" name="price" value="${location.price}"><br>
Manufactured-By:<input type="text" name="manufacturer" value="${location.manufacturer}"><br>

Date-Of-Expiry:<input type="date" name="date_of_expiry" value="${location.date_of_expiry}"><br>
<br><br>

<input type="submit" value="save">


</form><br>
</div>

</body>
</html>