<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: fluex404
  Date: 12/26/19
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <a href="helloagain">Hello Again</a>
    <form:form action="helloagain" modelAttribute="emp">
        Username: <form:input path="name"/><br/>
        Password: <form:input path="password"/>
        <form:errors path="password" cssClass="error"/><br/><br/>
        <input type="submit" value="submit"/>
    </form:form>
</body>
</html>
