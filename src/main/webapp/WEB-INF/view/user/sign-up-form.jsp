<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Student Form.</title>
    <style>.error {color: red}</style>
</head>
<body>

<i>Fill out form. Asterisk (*) means that field is required.</i>

<form:form action="show-user-data" modelAttribute="user">

    <br><br>
    First name (*):
    <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>

    <br><br>
    Last name (*):
    <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <br><br>
    Username (*):
    <form:input path="userName"/>
    <form:errors path="userName" cssClass="error"/>

    <br><br>
    Email (*):
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/>

    <br><br>
    Password (*):
    <form:password path="password"/>
    <form:errors path="password" cssClass="error"/>

    <br><br>
    Free passes:
    <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>

    <br><br>
    Course code:
    <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>

    <br><br>
    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
