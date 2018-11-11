<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Debitor</title>

</head>
<body>

<div>
    <p>SystemUser: </p>
    <ul>
        <c:forEach items="${requestScope.systemuserList}" var="systemuser">
        <li>
                ${systemuser.name}
                ${systemuser.email}
        </li>
        </c:forEach>

</div>
</body>
</html>