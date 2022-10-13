<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}
input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
button {
  background-color: #04AA6D;
  color: black;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}
h2 {text-align: center;}

pre {text-align: center;}
</style>

<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
	<h2>Create New Account</h2>
	<form action="saveReg" method="post">
	<pre>
		First Name<input type="text" name="firstname"/>
		Last Name<input type="text" name="lastName"/>
		Email Id<input type="text" name="email"/>
		Password<input type="text" name="password"/>
		<button type="submit" value="save">Save</button>
	</pre>
	</form>
</body>
</html>