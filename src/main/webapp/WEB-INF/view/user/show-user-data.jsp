<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Show user data.</title>
</head>
<body>

Show user data.

<br><br>
First Name: ${user.firstName}

<br><br>
Last Name: ${user.lastName}

<br><br>
User Name: ${user.userName}

<br><br>
Email: ${user.email}

<br><br>
Password: ${user.password}

<br><br>
Bank Data:
<ul>
    <c:forEach var="temp" items="${user.bankData}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

<br><br>
Address:
<ul>
    <c:forEach var="temp" items="${user.address}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

<br><br>
Birthday: ${user.birthday}

<br><br>
Free passes: ${user.freePasses}

<br><br>
Course code: ${user.courseCode}

</body>
</html>
