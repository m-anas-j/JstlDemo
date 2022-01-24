<%--
  Created by IntelliJ IDEA.
  User: jawad
  Date: 1/24/2022
  Time: 6:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    table,th,td
    {
        border:1px solid black;
    }
</style>
<html>
<head>
    <title>Employee Info</title>
</head>
<body>
<%-- Using JSTL forEach and out to loop a list and display items in table --%>
<table>
    <tbody>
        <tr><th>ID</th><th>Name</th><th>Role</th></tr>
            <c:forEach items="${requestScope.employeeList}" var="emp">
                <tr>
                    <td> <c:out value="${emp.id}"></c:out> </td>
                    <td> <c:out value="${emp.name}"></c:out> </td>
                    <td> <c:out value="${emp.role}"></c:out> </td>
                </tr>
            </c:forEach>
    </tbody>
</table>

</body>
</html>
