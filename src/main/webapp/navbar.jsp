<%--
  Created by IntelliJ IDEA.
  User: azizg
  Date: 06/12/2021
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->

    <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="css/util.css">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Shop Homepage - Start Bootstrap Template</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="acceuille/assets/favicon.ico" />
    <!-- Bootstrap icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="acceuille/css/styles.css" rel="stylesheet" />
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

</head>



<body>
<!-- Navigation-->
<nav class="navbar navbar-expand-lg navbar-light bg-darkkk2"  >

    <div class="container px-4 px-lg-5">

        <a class="navbar-brand" href="#!" style="color: white"> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp TECH APP <br> NEW GENERATION NEW DREAM</a>


        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                <li class="nav-item"><a class="nav-link active" aria-current="page" href="affichage?act=1&ut=<%=request.getParameter("ut")%>" style="color: white"><i class="material-icons" style="font-size:15px">&#xe88a;</i> &nbsp &nbsp  Home</a></li>
                &nbsp &nbsp &nbsp <li class="nav-item"><a class="nav-link" href="affichage?act=2&ut=<%=request.getParameter("ut")%>" style="color: white"><i class="material-icons" style="font-size:15px">&#xe30a;</i> &nbsp &nbsp  Ordinateur  </a></li>
                &nbsp &nbsp &nbsp <li class="nav-item"><a class="nav-link" href="affichage?act=3&ut=<%=request.getParameter("ut")%>" style="color: white"><i class="material-icons" style="font-size:15px">&#xe324;</i> &nbsp &nbsp  Telephone</a></li>
                &nbsp &nbsp &nbsp <li class="nav-item"><a class="nav-link" href="affichage?act=4&ut=<%=request.getParameter("ut")%>" style="color: white"><i class="material-icons" style="font-size:15px">&#xe324;</i> &nbsp &nbsp  montre</a></li>

                </li>
            </ul>


            <%
                String ch="";
            if(request.getAttribute("ut")!=null)
                ch= (String) request.getAttribute("ut");
            else
                ch= (String) request.getParameter("ut");






            %>
            <form method="post" action="acceuilleServlet?ut=<%=ch%>" enctype="multipart/form-data" class="d-flex">
                <button class="btn btn-outline-light" type="submit" style="text-decoration-color: white">
                    <i class="material-icons" style="font-size:16px">&#xe853;</i>

                    Account
                </button>


            </form>
            &nbsp &nbsp &nbsp
            <form class="d-flex">
                <a style="text-decoration: none;" class="btn btn-outline-light" href="index.jsp"> log out</a>


            </form>
        </div>
    </div>
</nav>
