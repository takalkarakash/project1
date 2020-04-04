<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/medicaldata.css">

<title>Medical Data</title>
</head>
<body>
<h3><u>Please enter the Data</u></h3>

<div class="container">
<form action="saveData" method="post">
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Type Of Medicine: Injection <input type="radio" name="typeOfMedicine" value="injection">
			Syrup <input type="radio" name="typeOfMedicine" value="syrup">
			Tablet <input type="radio" name="typeOfMedicine" value="tablet">
			<br><br>
Medicine-Name:  <input type="text" name="medicine_name"><br>
Price: &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp;<input type="text" name="price"><br>
Manufactured By: <input type="text" name="manufacturer"><br><br>
 Expiry Date:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="date" name="date_of_expiry"><br><br><br>
<input type="submit" value="save">

</form>
</div>
<a href="displayMedicalData">Click here to see the entered data</a>
</body>
</html>