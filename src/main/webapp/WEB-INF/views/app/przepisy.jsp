<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: tatiana
  Date: 07.06.2022
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header2.jsp" %>

<section>
    <div class="row padding-small">
        <i class="fas fa-users icon-users"></i>
        <h1>PRZEPISY:</h1>
        <hr>
        <div class="orange-line w-100"></div>
    </div>
</section>

<section class="mr-4 ml-4">
    <table class="table">
        <thead>
        <tr class="text-color-darker">
            <%--                        <th scope="col" class="col-1">ID</th>--%>
            <%--            <th scope="col" class="col-8">KATEGORIA</th>--%>
            <%--            <th scope="col" class="col-8">NAZWA</th>--%>
            <%--            <th scope="col" class="col-8">OPIS</th>--%>
            <%--            <th scope="col" class="col-8">SZCZEGÓŁY</th>--%>

            <th>KATEGORIA</th>
            <th>NAZWA</th>
            <th>OPIS</th>

            <th>SZCZEGÓŁY</th>

        </tr>
        <c:forEach items="${recipe}" var="recipe">
        <tbody class="text-color-lighter">

        <tr>
            <td>${recipe.category.name}</td>
            <td>${recipe.name}</td>
            <td>${recipe.description}</td>
            <td>
                <a href="<c:url value="/app/recipes/${recipe.id}"/>"
                   class="btn btn-info rounded-0 text-light">Szczegóły</a>
                    <%--                    <a href="/app/recipes/${recipe.id}" class="btn btn-info rounded-0 text-light">Szczegóły</a>--%>
                    <%--                    <a href="/app/recipes/details/${recipe.id}" class="btn btn-info rounded-0 text-light">Szczegóły</a>--%>
            </td>
        </tr>
        </c:forEach>
    </table>
</section>

<%@include file="footer2.jsp" %>
