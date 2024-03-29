<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: tatiana
  Date: 06.06.2022
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>GoodFood</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Charmonman:400,700|Open+Sans:400,600,700&amp;subset=latin-ext"
          rel="stylesheet">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
</head>
<header class="page-header">
    <nav class="navbar navbar-expand-lg justify-content-around">
<%--        <a href="" class="navbar-brand main-logo">--%>
            <a class="navbar-brand main-logo" >
            Good <span>Food</span>
        </a>
        <ul class="nav nounderline text-uppercase">
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="/app/recipes">PRZEPISY</a>
            </li>
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="/app/myrecipes">MOJE PRZEPISY</a>
            </li>
<%--            <li class="nav-item ml-4">--%>
<%--                <a class="nav-link color-header" href="/app/edit/user">EDYTUJ DANE</a>--%>
<%--            </li>--%>
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="/">WYLOGUJ</a>
            </li>
        </ul>
    </nav>
</header>