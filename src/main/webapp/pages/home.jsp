<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>home_page</title>
</head>
<body>
Hello ${sessionScope.user.login}

<div>
    <c:if test="${sessionScope.user != null}">
        <a href="/api/calc">Calc</a>
    </c:if>

    <c:if test="${sessionScope.user == null}">
        <a href="/api/reg">Registration</a>
        <a href="/api/auth">Authorization</a>
    </c:if>
</div>
</body>
</html>
