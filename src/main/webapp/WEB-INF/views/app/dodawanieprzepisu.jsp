<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: tatiana
  Date: 10.06.2022
  Time: 00:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header2.jsp" %>

<div class="m-4 p-3 width-medium text-color-darker">
    <div class="dashboard-content border-dashed p-3 m-4 view-height">

        <form:form method="post" modelAttribute="recipe">

            <div class="mt-4 ml-4 mr-4">
                <div class="row border-bottom border-3">
                    <div class="col"><h3 class="color-header text-uppercase">Nowy przepis</h3></div>
                    <div class="col d-flex justify-content-end mb-2">
                        <button type="submit" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4">Zapisz</button>
                    </div>
                </div>

                <table class="table borderless">
                    <tbody>
                    <tr class="d-flex">
                        <th scope="row" class="col-2">Nazwa Przepisu</th>
                        <td class="col-7">

                            <form:input path="name" class="w-100 p-1" placeholder="podaj nazwę przepisu"/>
                            <form:errors path="name"/>
                        </td>
                    </tr>
                      <tr class="d-flex">
                        <th scope="row" class="col-2">Kategoria Przepisu</th>
                        <td class="col-7">

                            <form:select path="category" items="${category}" itemLabel="name" itemValue="id" class="w-100 p-1"/>
                        </td>
                    </tr>
                    <tr class="d-flex">
                        <th scope="row" class="col-2">Opis przepisu</th>
                        <td class="col-7">
                            <form:textarea path="description" class="w-100 p-1" rows="5"
                                           placeholder="podaj opis przepisu"/>
                            <form:errors path="description"/>
                        </td>
                    </tr>
                    <tr class="d-flex">
                        <th scope="row" class="col-2">Przygotowanie (minuty)</th>
                        <td class="col-3">
                            <form:input path="preparationTime" class="p-1" type="number"
                                        placeholder="podaj czas przygotowania przepisu w minutach"/>
                            <form:errors path="preparationTime"/>
                        </td>
                    </tr>
                    </tbody>
                </table>

                <div class="row d-flex">
                    <div class="col-5 border-bottom border-3"><h3 class="text-uppercase">Sposób
                        przygotowania</h3></div>
                    <div class="col-2"></div>
                    <div class="col-5 border-bottom border-3"><h3 class="text-uppercase">Składniki</h3></div>
                </div>
                <div class="row d-flex">
                    <div class="col-5 p-4">
                        <form:textarea path="preparation" class="w-100 p-1" rows="10"/>
                        <form:errors path="preparation"/>
                    </div>
                    <div class="col-2"></div>

                    <div class="col-5 p-4">
                        <form:textarea path="ingredients" class="w-100 p-1" rows="10"/>
                        <form:errors path="ingredients"/>
                    </div>
                </div>
            </div>
        </form:form>
    </div>
</div>
</div>
</section>

<%@include file="footer2.jsp" %>