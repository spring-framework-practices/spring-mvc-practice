<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Student Form.</title>
</head>
<body>

<form:form action="processForm" modelAttribute="user">

    <br><br>
    Email:
    <form:input path="email"/>

    <br><br>
    Password:
    <form:password path="password"/>

    <br><br>
    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
