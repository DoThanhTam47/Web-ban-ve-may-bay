<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="model.TicketModel"%>
<%@page import="model.Item"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TRANG CHỦ</title>
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
	style="background: -webkit-radial-gradient(rgb(245 244 247), rgb(5, 11, 18)); background: radial-gradient(rgb(233 225 233), rgb(243, 244, 245)); height: 100%; min-height: 100%; margin: 0; padding: 0;">
	<header>

		<!--Navigation Bar-->
		<nav
			class="navbar navbar-expand-md navbar-dark font-weight-bold nav justify-content-center nav-justified"
			style="background: url('template/assets/img/dashboard.jpg'); border: 3px solid black;">
			<a class="navbar-brand" href="home?index=1"> <img
				src="template/assets/img/logo.png">
			</a>
			<!-- When navigation bar is collapsed"-->
			<div class="collapse navbar-collapse"
				style="display: inline !important;" id="navbarCollapse">
				<ul class="navbar-nav mr-auto nav nav-justified">
					
					<li class="nav-item"><a class="nav-link" href="Cart">GIỎ
							HÀNG<span class="sr-only"></span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="RegisterUser">ĐĂNG
							KÝ</a></li>
					<li class="nav-item"><a class="nav-link" href="login">ĐĂNG
							NHẬP</a></li>
				</ul>
			</div>
		</nav>
	</header>
	<!-- Table -->
	<div class="container" style="margin-top: 150px;">

		<c:if test="${cart != null }">
			<table
				class="table table-inverse table-striped table-bordered table-hover mx-auto table-responsive">
				<thead>
					<tr>
						<th>Số Lượng</th>
						<th>Mã Máy Bay</th>
						<th>Nơi Bay</th>
						<th>Nơi Đến</th>
						<th>Ngày Bay</th>
						<th>Ngày Đến</th>
						<th>Thời Gian</th>
						<th>Hạng Ghế</th>
						<th>Giá</th>
					</tr>
				</thead>
				<tbody>

					<%
					HashMap<Integer, Item> cart = (HashMap<Integer, Item>) session.getAttribute("cart");
					
					for (Map.Entry<Integer, Item> entry : cart.entrySet()) {
						Integer key = entry.getKey();
						Item item = entry.getValue();
					%>

					<tr>
						<td>
							<form action="UpdateQuantityItem" method="post">
								<input name="id" type="hidden"
									value="<%=item.getTicket().getTicketId()%>"> <input
									name="quantity" class="form-control" type="number"
									value="<%=item.getQuantity()%>" min="0" style="width: 60px;">
								<button class="btn btn-success" type="submit">Cập nhập
									số lượng</button>
							</form>
							
						</td>
						<td><%=item.getTicket().getMaMaybay()%></td>
						<td><%=item.getTicket().getNoiBay()%></td>
						<td><%=item.getTicket().getNoiDen()%></td>
						<td><%=item.getTicket().getNgayBay()%></td>
						<td><%=item.getTicket().getNgayDen()%></td>
						<td><%=item.getTicket().getThoiGian()%></td>
						<td><%=item.getTicket().getHangGhe()%></td>
						<td><%=item.getTicket().getGia() * item.getQuantity()%> VND</td>
						<td>
							<form action="DeleteItem" method="post">
								<input name="id" type="hidden" value="<%=item.getTicket().getTicketId()%>">
								<button class="btn btn-danger" type="submit">Xóa</button>
							</form>
						
						</td>
					</tr>
					
					<%
					}
					%>
				</tbody>
				<h3>Tổng Tiền : <%=session.getAttribute("total") %> VND</h3>
			</table>
			
			<h2>THÔNG TIN KHÁCH HÀNG</h2>
		<form action="CheckOut" method="post" style ="width : 400px; margin-left : 360px;">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">Vé sẽ được gửi qua mail cho bạn</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Full Name</label>
				<input type="text" class="form-control"
					id="exampleInputPassword1">
			</div><div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Phone Number</label>
				<input type="text" class="form-control"
					id="exampleInputPassword1">
			</div>
			<button type="submit" class="btn btn-primary">Thanh Toán</button>
		</form>
		</c:if>
		<c:if test="${cart == null }">
			<div class="alert alert-warning" role="alert">
				<h1>Chưa Có Gì Trong Giỏ Hàng</h1>
			</div>
		</c:if>
		

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