<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Admin</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<link href="<c:url value='template/assets/css/carousel.css' />" rel="stylesheet">
	<link href="<c:url value='template/assets/css/form-elements.css' />" rel="stylesheet">
	<link href="<c:url value='template/assets/css/style.css' />" rel="stylesheet">
	</head>
<body>
  <body style="background: -webkit-radial-gradient(rgb(9, 8, 9), rgb(9, 10, 10));  background: radial-gradient(rgb(163, 157, 163), rgb(206, 216, 225));height:100%; min-height:100%;margin:0;padding:0;">  
  
    <header>
        <!--Navigation Bar-->
        <nav class="navbar navbar-expand-md navbar-dark font-weight-bold nav justify-content-center nav-justified" style="background:url('template/assets/img/dashboard.jpg'); border:3px solid black;">
          <a class="navbar-brand" href="admin-home">
            <img src="template/assets/img/logo.png">				
          </a>
         <div class="collapse navbar-collapse" style="display:inline!important;" id="navbarCollapse">
            <ul class="navbar-nav mr-auto nav nav-justified">
              <li class="nav-item">
                <a class="nav-link" href="quan-ly-ve">QUẢN LÝ VÉ</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="add-admin">THÊM ADMIN</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="SignUp.html">ĐĂNG XUẤT</a>
              </li>
            </ul>
          </div>
        </nav>
        </header>
		<!--Slider-->
   <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel" data-pause="false" style="border-bottom:3px solid black; margin-bottom:1px;">
	<ol class="carousel-indicators">
		<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
		<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
	</ol>
	<div class="carousel-inner">
		<div class="carousel-item active">
			<img class="d-block" src="<c:url value='/template/assets/img/main.jpg' />" alt="First slide">
			<div class="carousel-caption d-md-block text-top">
				<h1>Welcome to AIRFLY Airlines!</h1>
			</div>
		</div>
		<div class="carousel-item">
			<img class="d-block img-fluid" src="<c:url value='/template/assets/img/bg.jpg' />" alt="Second slide">
			<div class="carousel-caption d-md-block">
				<h1>Where do you want to explore?</h1>
			</div>
		</div>
	</div>
	<!--Carousel indicators-->
		<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a>
		<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	
	<!-- FOOTER -->
		<footer class="text-center" style="color:white;background:url('template/assets/img/dashboard.jpg'); margin-bottom:0px; margin-top:4px; padding-top:3%; padding-bottom:4px; border-top:2px solid black;">
			<h6>AIRFLY Airlines 2022 &copy All Rights Reserved.</h6>
            <p><i>Web-site designed by  <a href="https://www.facebook.com/profile.php?id=100053389696402">Thành Tâm</a></i></p>
		</footer>	
</body>
</html>