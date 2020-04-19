<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
//alert(JSON.stringify('${userdet}'));
</script>

</head>
<body>
	<h2>${lebel }</h2>
	
	User : ${userdet}
	<br><br>	
	<table border="1">
		<tr>
			<td>Username :</td>
			<td>${userdet.name }</td>
		</tr>
		
		<tr>
			<td>Emp ID : </td>
			<td>${userdet.empid }</td>
		</tr>
	
		<tr>
			<td>Address : </td>
			<td>${userdet.address }</td>
		</tr>
	</table>
	
	<br><br>
<form action="http://localhost:8080/spring-mvc-helloworld-example/los/save" method="post">	
	Input
	<table >
		<tr>
			<td>Username :</td>
			<td><input id="uname" name="name" type="text"></td>
		</tr>
		
		<tr>
			<td>Emp ID : </td>
			<td><input id="uempid" name="empid" type="text"></td>
		</tr>
	
		<tr>
			<td>Address : </td>
			<td><input id="uaddress" name="address" type="text"></td>
		</tr>
	</table>
	
	<input type="submit" id="submitbtn" value="Save"/>
</form>	
	 

	
</body>
</html>