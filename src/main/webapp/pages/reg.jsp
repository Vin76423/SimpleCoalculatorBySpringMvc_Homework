<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>registration_page</title>
</head>
<body>
<c:if test="${massage != null}">
    <strong>${massage}</strong>
</c:if>

<form action="/api/reg" method="post">
    <input type="text" name="name" placeholder="name">
    <input type="text" name="login" placeholder="login">
    <input type="password" name="password" placeholder="password">
    <button>submit</button>
</form>
<a href="/api">Home</a>
</body>
</html>
