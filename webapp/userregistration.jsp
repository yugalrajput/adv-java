<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bg color="pink">
<center>
<form action="UserCtrl" method="get">
<table>
<tr>
<th>FirstName:</th><td><input type="text" name="fname" placeholder="Enter your fname"></td></tr>
<tr>
<th>LastName:</th><td><input type="text" name="lname" placeholder="Enter your lname"></td></tr>
<tr>
<th>Email:</th><td><input type="email" name="email" placeholder="Enter your email"></td></tr>
<tr>
<th>Password:</th><td><input type="password" name="psw" placeholder="Enter your password "></td></tr>
<tr>
<th>DOB:</th><td><input type="text" name="date" placeholder="Enter date"></td></tr>
</tr>
<tr>
<th></th><td><input type="submit" value="sign up"></td>
</tr>


</table>
</form>

</center>
</body>
</html>