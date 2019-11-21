<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/domath" method="post">
    <table>
        <tr>
            <td><input type="text" name="firstNum" placeholder="insert the 1st number"></td>
            <td><input type="text" name="secondNum" placeholder="insert the 2nd number"></td>
        </tr>
        <tr>
            <td><input type="submit" name="operator" value="addition"></td>
            <td><input type="submit" name="operator" value="subtraction"></td>
            <td><input type="submit" name="operator" value="multiplication"></td>
            <td><input type="submit" name="operator" value="division"></td>
        </tr>
    </table>
    <div>
        <c:if test="${result != null}">
            Result: <c:out value="${result}"/>
        </c:if>
    </div>
</form>
</body>
</html>
