<%--
  Created by IntelliJ IDEA.
  User: dz-gg-06
  Date: 19/11/18
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="post" action="save">
    <table>
        <tr>
            <td>Name :</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Salary :</td>
            <td><form:input path="salary"/></td>
        </tr>
        <tr>
            <td>Designation :</td>
            <td><form:input path="designation"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
