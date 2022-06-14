<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<h3>from database</h3>
<body>

<table>
    <thead>
    <tr>
        <th>description</th>
        <th>name</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${recipe}" var="recipe">
        <tr>

            <td>${recipe.description}</td>
            <td>${recipe.name}</td>

            <td>
                    <%--             Tutaj można wstawić jakiś opis lub link i b ędzie obok każdego wiersza--%>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>