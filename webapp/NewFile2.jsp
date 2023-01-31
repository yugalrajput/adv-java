<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Registration Form</h1>
<form action="NewFile.jsp" method="get">
Fname<input type="text" name="name" placeholder="enter your fname" require><br>
Lname<input type="text" name="name" placeholder="enter your lname" require>
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female<br>
DOB<input type="date" >
Emailid<input type="email" name="email" plceholder="enter your mail" require>
Password<input type="password" name="pwd" placeholder="" require>
<input type="submit" value="Signup">
</form>

</center>

</body>
</html>