<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
	<h2>Find Flight</h2>
	
	<form action="findFlights" method="post">
	<pre>
	Form :<input type="text" name="from"/>
	To :<input type="text" name="to"/>
	Departure Date :<input type="text" name="departureDate"/>
	<button type="submit">Search</button>
	</pre>
	</form>
</body>
</html>