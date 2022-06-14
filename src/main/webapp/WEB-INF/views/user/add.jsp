<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: tatiana
  Date: 04.06.2022
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../header.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<section class="dashboard-section">
    <div class="container pt-4 pb-4">
        <div class="border-dashed view-height">
            <div class="container w-25">
                <form:form method="post" modelAttribute="user">
                    <h1 class="text-color-darker">Rejestracja</h1>
                     <div class="form-group">
                        <form:hidden path="id"/>
                    </div>
                    <div class="form-group">
                        <form:input path="name" class="form-control" placeholder="podaj imię"/>
                        <form:errors path="name"/>
                    </div>
                    <div class="form-group">
                        <form:input path="surname" class="form-control" placeholder="podaj nazwisko"/>
                        <form:errors path="surname"/>
                    </div>
                    <div class="form-group">
                        <form:input path="mail" class="form-control" placeholder="podaj email"/>
                        <form:errors path="mail"/>
                    </div>
                    <div class="form-group">
                        <form:password path="password" class="form-control" placeholder="podaj hasło"/>
                        <form:errors path="password"/>
                    </div>
                    <div class="form-group">
                        <form:password path="repassword" class="form-control"  placeholder="powtórz hasło"/>
                        <form:errors path="repassword"/>
                    </div>
                    <button class="btn btn-color rounded-0" type="submit">Zarejestruj</button>
                </form:form>
            </div>
        </div>
    </div>
</section>
</body>
<%@ include file="../footer.jsp"%>