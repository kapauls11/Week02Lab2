<%-- 
    Document   : login
    Created on : Sep 18, 2017, 2:55:48 PM
    Author     : 698437
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
          <form action="LoginServlet" method="post">
                Username: <input type="number" name="username" value="${username}">
                Password: <input type="number" name="password" value="${password}">
                <input type="submit" value="login">
            </form>
          <p><i>${message}</i></p>
         ${errorMessage}
    </body>
</html>
