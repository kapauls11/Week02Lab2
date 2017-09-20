<%-- 
    Document   : java
    Created on : Sep 18, 2017, 6:40:36 PM
    Author     : 698437
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Error</title>
    </head>
    <body>
        <h1>Java Error</h1>
        <p>Sorry, Java has thrown an exception</p>
        <p>To continue, click the back button</p>
        
        <h2> Details</h2>
        <p>Type: {pageContext.exception["class"]}</p>
        <p>Message: {pageContext.exception.message}</p>
    </body>
</html>
