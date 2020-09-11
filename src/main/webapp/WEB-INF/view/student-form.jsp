<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Student Form.</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br><br>
    Last name: <form:input path="lastName"/>

    <br><br>
    <form:select path="country" items="${countries}" itemValue="shortName" itemLabel="fullName"/>

    <br><br>
    Favorite programming language:
    <br>
    <form:radiobuttons path="favoriteProgrammingLanguage" items="${programmingLanguages}"/>

    <br><br>
    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
