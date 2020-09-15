<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Student Confirmation.</title>
</head>
<body>

Confirmation of student:
<br><br>
First Name: ${student.firstName}
<br><br>
Last Name: ${student.lastName}
<br><br>
Country: ${student.country}
<br><br>
Favorite program212ё234ming language: ${student.favoriteProgrammingLanguage}
<br><br>
Favorite operating system:
<ul>
    <c:forEach var="temp" items="${student.favoriteOperatingSystem}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>
</html>
