<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Student Confirmation.</title>
</head>
<body>

Confirmation of student:
<br>
First Name: ${student.firstName}
<br>
Last Name: ${student.lastName}
<br>
Country: ${student.country}
<br>
Favorite programming language: ${student.favoriteProgrammingLanguage}

</body>
</html>
