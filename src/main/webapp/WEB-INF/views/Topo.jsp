<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" ng-app="Dashboard">
<head>
	<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Dashboard</title>

  <link type="text/css" rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" />
  <link rel="stylesheet" type="text/css" href="http://ehesp.github.io/Responsive-Dashboard/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="http://ehesp.github.io/Responsive-Dashboard/css/dashboard/dashboard.css">
  <link rel="stylesheet" type="text/css" href="http://ehesp.github.io/Responsive-Dashboard/css/themes/blue.css">
  <link type="text/css" rel="stylesheet" href="<c:url value="resources/css/estilo.css" />" />
  <!--
  <link rel="stylesheet" type="text/css" href="css/themes/green.css">
  <link rel="stylesheet" type="text/css" href="css/themes/red.css">
  -->

  <script type="text/javascript" src="http://ehesp.github.io/Responsive-Dashboard/js/angular.min.js"></script>
  <script type="text/javascript" src="http://ehesp.github.io/Responsive-Dashboard/js/angular-cookies.js"></script>
  <script type="text/javascript" src="http://ehesp.github.io/Responsive-Dashboard/js/ng-bootstrap-tpls.min.js"></script>
  <script type="text/javascript" src="http://ehesp.github.io/Responsive-Dashboard/js/angular/bootstrap.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
  <script type="text/javascript" src="<c:url value="resources/js/jquery-git2.js" />"></script>


</head>
<body ng-controller="MasterCtrl">
  <div id="page-wrapper" ng-class="{'active': toggle}" ng-cloak>

    <!-- Sidebar -->

    <div id="sidebar-wrapper">
      <ul class="sidebar">
        <li class="sidebar-main">
          <a href="#" ng-click="toggleSidebar()">
            Menu
            <span class="menu-icon glyphicon glyphicon-transfer"></span>
          </a>
        </li>
        <li class="sidebar-list">
          <a href="#">Pesquisa <span class="menu-icon glyphicon glyphicon-search"></span></a>
        </li>
        <li class="sidebar-list">
          <a href="#">Novo Assalto <span class="menu-icon glyphicon glyphicon-tag"></span></a>
        </li>
        <li class="sidebar-list">
          <a href="#">Ranking <span class="menu-icon glyphicon glyphicon-stats"></span></a>
        </li>
      </ul>
      <div class="sidebar-footer">
        <div class="col-xs-6">
          <a href="https://github.com/Ehesp/Responsive-Dashboard" target="_blank">
            FeedBack
          </a>
        </div>
        <div class="col-xs-6">
          <a href="#" target="_blank">
            Sobre
          </a>
        </div>
      </div>
    </div>

    <!-- End Sidebar -->

    <div id="content-wrapper">
      <div class="page-content">

        <!-- Header Bar -->

        <div class="row header">
          <div class="col-xs-12">
            <div class="meta pull-left">
              <div class="page">
                Mapa
              </div>
            </div>
            <div class="user pull-right">
              <div class="item dropdown">
                <a href="#" class="dropdown-toggle">
                  <img src="<c:url value="/resources/img/avatar.jpg" />">
                </a>
                <ul class="dropdown-menu dropdown-menu-right">
                  <li class="dropdown-header">
                    ${usuario.getNome()}
                  </li>
                  <li class="divider"></li>
                  <li class="link">
                    <a href="#">
                      Profile
                    </a>
                  </li>
                  <li class="divider"></li>
                  <li class="link">
                    <a href="#">
                      Logout
                    </a>
                  </li>
                </ul>               
              </div>
              <div class="item dropdown">
               <a href="#" class="dropdown-toggle">
                  <i class="glyphicon glyphicon-home"></i>
                </a>
                <ul class="dropdown-menu dropdown-menu-right">
                  <li class="dropdown-header">
                    Posição
                  </li>
                  <li class="divider"></li>
                  <li>
                    <a href="#">Inicial</a>
                  </li>
                  <li>
                    <a href="#">Minha Localização</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>