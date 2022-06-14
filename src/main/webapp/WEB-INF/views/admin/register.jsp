<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %><%--
  Created by IntelliJ IDEA.
  User: arek
  Date: 02.06.2022
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../header.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<section class="dashboard-section">
    <div class="container pt-4 pb-4">
        <div class="border-dashed view-height">
            <div class="container w-25">
                <h1 class="text-color-darker">Rejestracja</h1>
                <form method="post">
                    <div><label> User Nick : <input type="text" name="username"/> </label></div>
                    <%--                    <div><label> User Surname: <input type="text" name="surname"/> </label></div>--%>
                    <%--                    <div><label> User E-mail: <input type="text" name="mail"/> </label></div>--%>
                    <div><label> Password: <input type="password" name="password"/> </label></div>

                    <button class="btn btn-color rounded-0" type="submit">Zarejestruj</button>
                    <%--                    <div><input type="submit" value="Sign In"/></div>--%>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                </form>
                </di>
            </div>
        </div>
    </div>
</section>
</body>
<%@ include file="../footer.jsp" %>