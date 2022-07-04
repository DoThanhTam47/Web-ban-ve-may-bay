<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List User</title>
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
					<li class="nav-item"><a class="nav-link" href="AdminListTicket?index=1">QUẢN
							LÝ VÉ</a></li>
					<li class="nav-item"><a class="nav-link" href="quan-ly-user">QUẢN
							USER</a></li>
					<li class="nav-item"><a class="nav-link" href="AddAdmin">THÊM
							ADMIN</a></li>
					<li class="nav-item"><a class="nav-link" href="logout">ĐĂNG
							XUẤT</a></li>
				</ul>
			</div>
		</nav>
	</header>

	<!-- Table -->
	<div class="container" style="margin-top: 50px;">
		<table
			class="table table-inverse table-striped table-bordered table-hover mx-auto table-responsive">
			<thead>
				<tr>
					<th>Email</th>
					<th>FullName</th>
					<th>Phone Number</th>
					<th>Role</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${lists}">

					<tr>
						<td><c:out value="${user.email}" /></td>
						<td><c:out value="${user.fullName}" /></td>
						<td><c:out value="${user.phoneNumber}" /></td>
						<td>
							<c:if test = "${user.roleId == 1 }">Admin</c:if>
							<c:if test = "${user.roleId == 2 }">User</c:if>
						</td>

						<td> <a
							href="#" onclick="showMess(${user.userId})">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
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
	
	
	
	<script type="text/javascript">
		function showMess(userId) {
			var option = confirm('bạn có chắc muốn xóa');
			if (option === true){
				window.location.href = 'deleteUser?id='+userId;
			}
		}
	</script>
</body>
</html>