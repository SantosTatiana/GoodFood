<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: tatiana
  Date: 06.06.2022
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header2.jsp" %>


<div class="m-4 p-3 width-medium">
    <div class="dashboard-content border-dashed p-3 m-4 view-height">
        <div class="row border-bottom border-3 p-1 m-1">
            <div class="col noPadding"><h3 class="color-header text-uppercase">Lista Przepisów</h3></div>
            <div class="col noPadding d-flex justify-content-end mb-2"><a href="/app/myrecipes/add"
                                                                          class="btn btn-success rounded-0 pt-0 pb-0 pr-4 pl-4">Dodaj
                przepis</a></div>
        </div>
        <table class="table border-bottom schedules-content">
            <thead>
            <tr class="d-flex text-color-darker">
                <th scope="col" class="col-1">KATEGORIA</th>
                <th scope="col" class="col-2">NAZWA</th>
                <th scope="col" class="col-7">OPIS</th>
                <th scope="col" class="col-2 center">AKCJE</th>

            </tr>
            </thead>
            <tbody class="text-color-lighter">
            <c:forEach items="${recipe}" var="recipe">

                <tr class="d-flex">
                    <th scope="row" class="col-1">${recipe.category.name}</th>
                    <td class="col-2">
                            ${recipe.name}
                    </td>
                    <td class="col-7">${recipe.description}</td>
                    <td class="col-2 d-flex align-items-center justify-content-center flex-wrap">
                        <a href="<c:url value="/app/myrecipes/delete/${recipe.id}"/>"
                           class="btn btn-danger rounded-0 text-light m-1">Usuń</a>
                        <a href="<c:url value="/app/myrecipes/details/${recipe.id}"/>"
                           class="btn btn-info rounded-0 text-light m-1">Szczegóły</a>
                        <a href="<c:url value="/app/myrecipes/edit/${recipe.id}"/>"
                           class="btn btn-warning rounded-0 text-light m-1">Edytuj</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</div>
</section>

<%@include file="footer2.jsp" %>