<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/6/2023
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich</h1>
<form action="sandwich/list" method="get">
    <c:forEach var="sandwich" items="${list}">
        <select name="choice" id="">
            <option value="${sandwich.component}">${sandwich.component}</option>
        </select>
    </c:forEach>
    <input type="submit" value="save">
</form>

</body>
</html>
