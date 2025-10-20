<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="forms-div">
        <h1>Login</h1>
        <form action="auth" method="POST">
            <div class="forms-field">
                <label for="txtEmail">Email:</label>
                <input type="email" name="txtEmail" id="txtEmail">
            </div>
            <div class="forms-field">
                <label for="txtPassword">Password:</label>
                <input type="password" name="txtPassword" id="txtPassword">
            </div>
            <div>
                <input type="submit" name="txtLogin" id="txtLogin" value="Sign In">
            </div>
            <p>Don't have an account? <a href="register.html">Sign up</a></p>
        </form>
    </div>
</body>
</html>