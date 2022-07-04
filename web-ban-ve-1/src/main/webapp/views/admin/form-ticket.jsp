<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Ticket</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
<link href="<c:url value='/template/assets/css/carousel.css' />"
	rel="stylesheet">
<link href="<c:url value='/template/assets/css/form-elements.css' />"
	rel="stylesheet">
<link href="<c:url value='/template/assets/css/style.css' />"
	rel="stylesheet">
</head>
<body>
<body
	style="background: -webkit-radial-gradient(rgb(9, 8, 9), rgb(9, 10, 10)); background: radial-gradient(rgb(163, 157, 163), rgb(206, 216, 225)); height: 100%; min-height: 100%; margin: 0; padding: 0;">

	<header>
		<!--Navigation Bar-->
		<nav
			class="navbar navbar-expand-md navbar-dark font-weight-bold nav justify-content-center nav-justified"
			style="background: url('template/assets/img/dashboard.jpg'); border: 3px solid black;">
			<a class="navbar-brand" href="admin-home"> <img
				src="template/assets/img/logo.png">
			</a>
			<div class="collapse navbar-collapse"
				style="display: inline !important;" id="navbarCollapse">
				<ul class="navbar-nav mr-auto nav nav-justified">
					<li class="nav-item"><a class="nav-link"
						href="AdminListTicket?index=1">QUẢN LÝ VÉ</a></li>
					<li class="nav-item"><a class="nav-link" href="quan-ly-user">QUẢN
							LÝ USER</a></li>
					<li class="nav-item"><a class="nav-link" href="AddAdmin">THÊM
							ADMIN</a></li>
					<li class="nav-item"><a class="nav-link" href="logout">ĐĂNG
							XUẤT</a></li>
				</ul>
			</div>
		</nav>
	</header>

	<!-- Top content -->
	<div class="top-content">
		<div class="inner-bg" style="padding: 0px 0px 80px 0;">
			<div class="container">
				<div class="row" style="margin-left: 17%; margin-right: 17%;">
					<div>
						<div class="form-box">
						<div class="alert alert-success center" role="alert">
									<p>${NOTIFICATION}</p>
						</div>
							<div class="form-top">
								<div class="form-top-left">
									<h3 style="color: white;">Thêm Vé Máy Bay</h3>
								</div>
								<div class="form-top-right">
									<i class="fa fa-plane"></i>
								</div>
							</div>
							<div class="form-bottom" style="color: white;">


								<form role="form" action="AddTicket" method="post"
									class="flight-search-form">

									
										<input type="hidden" name="id"
											value="" />
									

									<div class="row">
										<div class="form-group col-lg-4 ui-widget">
											<label for="Ma">Mã Máy Bay</label> <input required
												type="text" value="" name="maMayBay"
												placeholder="Mã Máy Bay..." class="form-control"
												id="osearch"
												style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
										</div>
										<div class="form-group col-lg-4 ui-widget">
											<label for="from">Nơi Bay</label> <input required type="text"
												value=""
												name="noiBay" placeholder="Nơi Bay..." class="form-control"
												id="osearch"
												style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
										</div>
										<div class="form-group col-lg-4 ui-widget">
											<label for="to">Nơi Đến</label> <input required type="text"
												value=""
												name="noiDen" placeholder="Nơi Đến..." class="form-control"
												id="dsearch"
												style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
										</div>
										<div class="form-group col-lg-4">
											<label for="depart">Ngày Bay</label> <input required
												type="date" value="" name="ngayBay" max="2023-12-31" min="2020-12-31" placeholder="yyyy-mm-dd"
												class="form-control" id="datepicker"
												style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
										</div>
										<div class="form-group col-lg-4">
											<label for="depart">Ngày Đến</label> <input required
												type="date" value="" name="ngayDen" max="2023-12-31" min="2020-12-31" placeholder="yyyy-mm-dd"
												class="form-control" id="datepicker"
												style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
										</div>
										<div class="form-group col-lg-4 ui-widget">
											<label for="to">Thời Gian</label> <input required type="text"
												value=""
												name="thoiGian" placeholder="Thời Gian..."
												class="form-control" id="dsearch"
												style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
										</div>
									</div>
									<div class="row">
										<div class="form-group col-lg-4">
											<label for="class">Hạng Ghế</label> <select required
												name="hangGhe" class="form-control" id="form-class"
												style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
												<option value="Thuong"
													style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
													Thuong</option>
												<option value="Thuong gia"
													style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
													Thuong Gia</option>
											</select>
										</div>
										<div class="form-group col-lg-4 ui-widget">
											<label for="to">Giá</label> <input required type="text"
												value="" name="gia"
												placeholder="Giá..." class="form-control" id="dsearch"
												style="height: 50px; margin: 0; padding: 0 20px; vertical-align: middle; background: #fff; border: 3px solid #fff; font-family: 'Roboto', sans-serif; font-size: 16px; font-weight: 300; line-height: 50px; color: #888; -moz-border-radius: 4px; -webkit-border-radius: 4px; border-radius: 4px; -moz-box-shadow: none; -webkit-box-shadow: none; box-shadow: none; -o-transition: all .3s; -moz-transition: all .3s; -webkit-transition: all .3s; -ms-transition: all .3s; transition: all .3s;">
										</div>
									</div>
									<div style="text-align: center;">
										<button style="margin-top: 5%; font-size: 30px;" type="submit"
											class="btn col-xs-5 col-md-5">Save</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- FOOTER -->
	<footer class="text-center"
		style="color: white; background: url('template/assets/img/dashboard.jpg'); margin-bottom: 0px; margin-top: 4px; padding-top: 3%; padding-bottom: 4px; border-top: 2px solid black;">
		<h6>AIRFLY Airlines 2022 &copy All Rights Reserved.</h6>
		<p>
			<i>Web-site designed by <a
				href="https://www.facebook.com/profile.php?id=100053389696402">Thành
					Tâm</a></i>
		</p>
	</footer>


</body>
</html>