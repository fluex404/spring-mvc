<%--
  Created by IntelliJ IDEA.
  User: fluex404
  Date: 12/26/19
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC</title>
</head>
<body>
    <h3>Welcome to Spring MVC</h3><br/>
    <a href="hello">Click here...</a><br/>
    <a href="hello1">Hello 1</a><br/>
    <a href="hello2">Hello 2</a><br/>

    <form action="hello3" method="get">
        <label>Username</label> : <input type="text" name="name"/><br/>
        <label>Password</label> : <input type="password" name="password"><br/>
        <input type="submit" name="submit">
    </form>
</body>
</html>
