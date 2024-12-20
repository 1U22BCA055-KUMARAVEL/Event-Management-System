<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>


<body>
<div id="login">
<h1>Login Form</h1>
    <form action="LoginServlet" method="get">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" placeholder="Enter Username" required>
    <br>
    <label for="password">Password:</label>
    <input type="password" name="password" id="password" placeholder="Enter Password" required>
    <br>
    <button type="submit" name="action" value="login">Login</button>
    <button type="button" onclick="redirect()">Register</button>
</form>
</div>
<script>
    function redirect() {
        window.location.href = "registration.jsp";
    }
</script>

</body>
</html>
