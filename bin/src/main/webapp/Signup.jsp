<!DOCTYPE html>
<html>
<head>
	<title>Sign Up</title>
	<link rel="stylesheet" type="text/css" href="Signup.css">
</head>
<body style="background-color: #e69900">
	<nav><img src="logo.png">
	</nav>
<br><br><br><br>
<form action="/signup" method="post">
<section class="sect">
	<label for="uname">User name</label>
	<input type="text" id="uname" name="username" required/><br>&nbsp
	<label for="pwd">Pass word</label>
	<input type="password" id="pwd" name="password" required/><br>
	<label for="nick">Nick name</label>
	<input type="text" id="nick" name="nickname" required/><br>
	<label for="phone">Contact</label>&nbsp&nbsp&nbsp&nbsp
	<input type="number" id="phone" name="contact" required/><br>
	<label for="email" required>email</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
	<input type="text" id="email" name="email"/><br>
			<button class="button" type="submit" id="button1">Signup</button>
		</form>
		
	
</section>
</body>
</html>