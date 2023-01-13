<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<%
    String users[] = new String[]{"ONE", "TWO"};
    request.setAttribute("users", users);
%>
<c:forEach var="user" items="${users}">
    <p>${user}</p>
</c:forEach>
</body>
</html>