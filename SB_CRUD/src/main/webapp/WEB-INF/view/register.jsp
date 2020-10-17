<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" name="text/html"
	content="width=device-width, initial-scale=1, charset=ISO-8859-1">
<title>Register</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: black;
}

* {
	box-sizing: border-box;
}

/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
	padding-right: 300px;
    padding-top: 50px;
    padding-left: 300px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
</head>

<body>

	<f:form action="insertData" modelAttribute="data" method="post">
		<div class="container">
			<center>
				<h1>Register</h1>
			</center>
			<p>Please fill this form to register.</p>
			<hr>

			<label for="firstName"><b>First Name</b></label>
			<f:input path="fname" placeholder="Enter First Name" />
			<br> <label for="lastName"><b>Last Name</b></label>
			<f:input path="lname" placeholder="Enter Last Name" />
			<br> <label for="userName"><b>User Name</b></label>
			<f:input path="uname" placeholder="Enter Email"
				onkeyup="verifyEmail()" />
			<br> <label for="psw"><b>Password</b></label>
			<f:input path="password" placeholder="Enter Password" />
			<br> <label for="psw-repeat"><b>Repeat Password</b></label>
			<f:input path="rpassword" placeholder="Re-Enter Password" />
			<br>

			<hr>

			<button type="submit" class="registerbtn">Register</button>
			<f:hidden path="id" />
			<center>
				<a href="search">Search</a>
			</center>
		</div>

	</f:form>
</body>
</html>