<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Success</title>
</head>
<body>

<% String user = (String) request.getAttribute("user"); %>

<h2>Welcome <%= user %>, Login Successful!</h2>

<a href="login.html">Back to Login</a>

</body>
</html>