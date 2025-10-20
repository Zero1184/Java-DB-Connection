<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="br.ifsp.javawebdb.model.User"%>
<%  
	User user = (User) session.getAttribute("user");
	if (user == null) {
	    response.sendRedirect("login.jsp");
	    return;
	}

%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Hello DB connection! &#x1F60E;</h1>
</body>
</html>