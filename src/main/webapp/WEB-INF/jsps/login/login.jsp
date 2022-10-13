<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
html, body{
   padding:0px;
   margin:0px;
   background:#F8F2ED;
   font-family: 'Raleway', sans-serif;
   color:#FFF;
   height:100%;
}
form {border: 3px solid #f1f1f1;
	width: 100%;
	box-sizing: border-box;
	}
input[type=text], input[type=password] {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 50%;
}

button:hover {
  opacity: 0.8;
}
h2 {text-align: center;}
pre {text-align: center;}
</style>

<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h2>Login Hear!</h2>
	
	<form action="verifyLogin" method="post">
	<pre>
	Email Id<input type="text" name="email"/>
	Password<input type="password" name="password"/>
	<button type="submit" value="login">Log In</button>
	${error }
	</pre>
	</form>
</body>
</html>