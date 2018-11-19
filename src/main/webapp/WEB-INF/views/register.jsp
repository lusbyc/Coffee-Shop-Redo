<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Become a Coffee Club Member!</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cosmo/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-3Ivskwia8Fui5tbQi+RW4DgTkJ8d+hW7mLe7Yk89ibmD9482VECh0WFof8kIEjwI"
	crossorigin="anonymous">
<link rel="stylesheet" href="main.css">
</head>
<body>

	<h1>Let's stay in touch!</h1>
	<br>

	<p>Registered coffee club members receive a free drink and pastry
		item during their birthday month!</p>

	<table>
		<thead>
		</thead>
		<tbody>
			<form action="/addcustomer" method="post">
				<tr>
					<td>First Name:</td>
					<td><input id="firstname" type="text" name="firstname"></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input id="lastname" type="text" name="lastname"></td>
				<tr>
					<td>Email:</td>
					<td><input id="email" type="email" name="email"></td>
				</tr>
				<tr>
					<td>Phone Number:</td>
					<td><input id="phone" type="text"
						phone placeholder="313-123-4567" name="phone"></td>
				</tr>
				<!-- <form action="/action_page.php">  -->
				<tr>
					<td>Birthday:</td>
					<td><input id="birthday" type="date" name="birthdate"></td>
				<tr>
					<td><input class="btn btn-primary" type="submit"
						value="Register"></td>
				</tr>
		</tbody>
	</table>
	<!--  </form>  -->

	</form>


	<script src="script.js"></script>



</body>
</html>