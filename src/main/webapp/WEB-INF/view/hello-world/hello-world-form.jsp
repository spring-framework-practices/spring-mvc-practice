<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <title>Hello World Form.</title>
</head>
<body>
<%--<form action="${pageContext.request.contextPath}/hello/processForm" method="get">--%>
<%--<form action="${pageContext.request.contextPath}/hello/processFormVersionTwo" method="get">--%>
<form action="${pageContext.request.contextPath}/hello/processFormVersionThree" method="get">
    <label>
        <input type="text" name="studentName" placeholder="What's you name?" />
    </label>
    <input type="submit" />

</form>
</body>
</html>
