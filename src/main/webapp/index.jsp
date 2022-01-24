<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%=
"Press the following button to see the list of employees:" %>
</h1>
<br/>

<form action="EmployeeServlet" method="get">
    <input type="submit" value="Show">
</form>

<%--Showing how different JSP EL expressions like arithmatic or logical--%>
<%--operations evaluate to their actual values--%>
${1<2}
<br>
${1+2+3}

</body>
</html>