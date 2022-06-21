<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>THÊM ADMIN</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
<link href="<c:url value='template/assets/css/carousel.css' />"
	rel="stylesheet">
<link href="<c:url value='template/assets/css/form-elements.css' />"
	rel="stylesheet">
<link href="<c:url value='template/assets/css/style.css' />"
	rel="stylesheet">
</head>
<body>
<body
	style="background: -webkit-radial-gradient(rgb(15, 14, 16), rgb(5, 11, 18)); background: radial-gradient(rgb(12, 11, 12), rgb(5, 11, 18)); height: 100%; min-height: 100%; margin: 0; padding: 0;">
	<header>
        <!--Navigation Bar-->
        <nav class="navbar navbar-expand-md navbar-dark font-weight-bold nav justify-content-center nav-justified" style="background:url('template/assets/img/dashboard.jpg'); border:3px solid black;">
          <a class="navbar-brand" href="admin-home">
            <img src="template/assets/img/logo.png">				
          </a>
         <div class="collapse navbar-collapse" style="display:inline!important;" id="navbarCollapse">
            <ul class="navbar-nav mr-auto nav nav-justified">
              <li class="nav-item">
                <a class="nav-link" href="admin-home">QUẢN LÝ VÉ</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="admin">THÊM ADMIN</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="SignUp.html">ĐĂNG XUẤT</a>
              </li>
            </ul>
          </div>
        </nav>
        </header>
	<!-- Top content -->
	<div class="top-content"
		style="background: url('template/assets/img/sign.jpg'); height: 100%; min-height: 100%; margin: 0; padding: 0;">
		<div class="inner-bg" style="padding: 0px">
			<div class="container">
				<div class="row">
					<div class='col-lg-4'></div>
					<div class="col-lg-5">
						<div class="form-box" style='margin-bottom: 10%;'>
						<div class="alert alert-success center" role="alert">
									<p>${NOTIFICATION}</p>
						</div>
							<div class="form-top">
								<div class="form-top-left">
									<h3>ĐĂNG KÝ</h3>
								</div>
								<div class="form-top-right">
									<i class="fa fa-lock"></i>
								</div>
							</div>
							<div class="form-bottom" style="color: white;">
								
								<form role="form" action="add-admin" method="post"
									class="login-form">
									<div class="form-group">
										<label for="form-username">Email</label> <input required
											type="email" name="email" placeholder="Email..."
											class="form-username form-control" id="form-username"
											style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
									</div>
									<div class="form-group">
										<label for="form-username">Full Name</label> <input required
											type="text" name="fullName" placeholder="Ex.Do Thanh Tam"
											class="form-username form-control" id="fullname">
									</div>
									
									<div class="form-group">
										<label for="form-username">Phone Number</label> <input
											required type="text" name="phoneNumber"
											placeholder="Phone Number" class="form-username form-control"
											id="phonenumber">
									</div>
									
									<div class="form-group">
										<label for="form-password">Password</label> <input required
											type="password" name="password" placeholder="Password..."
											class="form-password form-control" id="form-password">
									</div>
			
									<button style="margin-top: 5%;" type="submit" class="btn">ĐĂNG
										KÝ</button>
								</form>
							</div>
						</div>
					</div>
					<div class='col-lg-4'></div>
				</div>
			</div>
		</div>
	</div>
	<!-- FOOTER -->
	<footer class="text-center"
		style="color:white;background:url('<c:url value='template/assets/img/dashboard.jpg' />'); margin-bottom:0px; margin-top:4px; padding-top:3%; padding-bottom:4px; border-top:2px solid black;">
		<h6>AIRFLY Airlines 2022 &copy All Rights Reserved.</h6>
		<p>
			<i>Web-site designed by <a
				href="https://www.facebook.com/profile.php?id=100053389696402">Thành
					Tâm</a></i>
		</p>
	</footer>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
		integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
		integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
		crossorigin="anonymous"></script>
	<svg xmlns="http://www.w3.org/2000/svg" width="500" height="500"
		viewBox="0 0 500 500" preserveAspectRatio="none"
		style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;">
		<defs>
		<style type="text/css"></style></defs>
		<text x="0" y="25"
			style="font-weight:bold;font-size:25pt;font-family:Arial, Helvetica, Open Sans, sans-serif">500x500</text></svg>
</body>
</html>