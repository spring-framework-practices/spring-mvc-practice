<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Principal Page.</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/greeting">Greeting.</a>

<br/>
<a href="${pageContext.request.contextPath}/hello/showForm">Hello Form.</a>

<br/>
<a href="${pageContext.request.contextPath}/student/showForm">Hello Student Form.</a>

<br/>
<a href="${pageContext.request.contextPath}/user/sign-up">User sign up Form.</a>

<br/>
<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" alt="21">

</body>
</html>
