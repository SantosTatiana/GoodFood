<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: tatiana
  Date: 07.06.2022
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header2.jsp" %>
<div class="m-4 p-3 width-medium text-color-darker">
    <div class="m-4 border-dashed view-height">
        <div class="mt-4 ml-4 mr-4">
            <!-- fix action, method -->
            <!-- add name attribute for all inputs -->
            <form:form method="post" modelAttribute="user">
                <form:hidden path="id"/>
                <%--                <div class="row border-bottom border-3">--%>
                <%--                    <div class="col"><h3 class="color-header text-uppercase">ZMIEŃ SWOJE DANE:</h3></div>--%>
                <%--                    <div class="col d-flex justify-content-end mb-2">--%>
                <%--                    </div>--%>
                <%--                </div>--%>


                <div class="row border-bottom border-3">
                    <div class="col"><h3 class="color-header text-uppercase">ZMIEŃ SWOJE HASŁO:</h3></div>
                    <div class="col d-flex justify-content-end mb-2">
                    </div>
                </div>
                <table class="table borderless">
                    <tbody>
                    <tr class="d-flex">
                        <th scope="row" class="col-2"><h4>Nowe hasło</h4></th>
                        <td class="col-7">
                            <form:password path="password" class="w-100 p-1" placeholder="podaj hasło"/>
                            <form:errors path="password"/>
                        </td>
                    </tr>
                    <tr class="d-flex">
                        <th scope="row" class="col-2"><h4>Powtórz hasło</h4></th>
                        <td class="col-7">
                            <form:password path="repassword" class="w-100 p-1" placeholder="powtórz hasło"/>
                            <form:errors path="repassword"/>
                            <br>
                            <br>
                            <button type="submit" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4">Zapisz
                            </button>
                        </td>
                    </tr>


                    </tbody>
                </table>
                <div class="row border-bottom border-3">
                    <div class="col"><h3 class="color-header text-uppercase">ZMIEŃ SWÓJ E-MAIL:</h3></div>
                    <div class="col d-flex justify-content-end mb-2">
                    </div>
                </div>
                <table class="table borderless">
                    <tbody>
                    <tr class="d-flex">
                        <th scope="row" class="col-2"><h4>Nowy e-mail</h4></th>
                        <td class="col-7">
                            <form:input path="mail" class="w-100 p-1" placeholder="podaj e-mail"/>
                            <form:errors path="mail"/>
                        </td>
                    </tr>
                    <tr class="d-flex">
                        <th scope="row" class="col-2"><h4>Powtórz e-mail</h4></th>
                        <td class="col-7">
                            <form:input path="mail" class="w-100 p-1" placeholder="powtórz e-mail"/>
                            <form:errors path="mail"/>
                            <br>
                            <br>
                            <button type="submit" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4">Zapisz
                            </button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </form:form>
        </div>
    </div>

</div>
</div>
</section>

<%@include file="footer2.jsp" %>