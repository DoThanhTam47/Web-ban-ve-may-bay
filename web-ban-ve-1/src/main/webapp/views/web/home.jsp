<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
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
	style="background: -webkit-radial-gradient(rgb(245 244 247), rgb(5, 11, 18)); background: radial-gradient(rgb(233 225 233), rgb(243 244 245)); height: 100%; min-height: 100%; margin: 0; padding: 0;">
	<header>

	<!--Navigation Bar-->
    <nav class="navbar navbar-expand-md navbar-dark font-weight-bold nav justify-content-center nav-justified" style="background:url('template/assets/img/dashboard.jpg'); border:3px solid black;">
      <a class="navbar-brand" href="home?index=1">
		<img src="template/assets/img/logo.png">				
	  </a>
	 <!-- When navigation bar is collapsed"-->
	 <div class="collapse navbar-collapse" style="display:inline!important;" id="navbarCollapse">
        <ul class="navbar-nav mr-auto nav nav-justified">
		   
		  <li class="nav-item">
            <a class="nav-link" href="Cart">GIỎ HÀNG<span class="sr-only"></span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="RegisterUser">ĐĂNG KÝ</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="login">ĐĂNG NHẬP</a>
          </li>
        </ul>
      </div>
    </nav>
	</header>
	<!-- Top content -->
        <div class="top-content">
            <div class="inner-bg" style="padding:0px 0px 80px 0;">
                <div class="container">
                    <div class="row" style="margin-left:17%; margin-right:17%;">
                        <div>
                        	<div class="form-box">
	                        	<div class="form-top">
	                        		<div class="form-top-left">
	                        			<h3 style ="color:white;">Tìm Kiếm Chuyến Bay</h3>
	                        		</div>
	                        		<div class="form-top-right">
	                        			<i class="fa fa-plane"></i>
	                        		</div>
	                            </div>
	                            <div class="form-bottom" style="color:white;">
				                    <form role="form" action="SearchTicket?index=1" method="post" class="flight-search-form">
                              			<div class="row">                                                            
				                    	<div class="form-group col-lg-4 ui-widget">
				                    		<label for="from">Nơi Bay</label>
				                        	<input  type="text" name="noiBay" placeholder="Nơi Bay..." class="form-control" id="osearch" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">                                                                
				                        </div>
				                        <div class="form-group col-lg-4 ui-widget">
				                        	<label for="to">Nơi Đến</label>
				                        	<input  type="text" name="noiDen" placeholder="Nơi Đến..." class="form-control" id="dsearch" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">
				                        </div>
				                    	<div class="form-group col-lg-4">
				                    		<label for="depart">Ngày Bay</label>
				                        	<input  type="date" name="ngayBay" max="2023-12-31" class="form-control" id="form-depart" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">											
				                        </div>
										</div>
									
										<div style="text-align:center;">
											<button style="margin-top:5%;" type="submit" class="btn col-xs-5 col-md-5">Tìm Kiếm</button>
										</div>
									</form>
			                    </div>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
		 <!-- Table -->
		 <div class="container" style="margin-top:10px ;">
            <table class="table table-inverse table-striped table-bordered table-hover mx-auto table-responsive">
                <thead>
                  <tr>
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
				<c:forEach var="ticket" items="${lists}">

					<tr>
						<td><c:out value="${ticket.maMaybay}" /></td>
						<td><c:out value="${ticket.noiBay}" /></td>
						<td><c:out value="${ticket.noiDen}" /></td>
						<td><c:out value="${ticket.ngayBay}" /></td>
						<td><c:out value="${ticket.ngayDen}" /></td>
						<td><c:out value="${ticket.thoiGian}" /></td>
						<td><c:out value="${ticket.hangGhe}" /></td>
						<td class="price"><c:out value="${ticket.gia} VND" /></td>

						<td>
							<form action="Cart" method = "POST">
								<input name="id" type="hidden" value="${ticket.ticketId}"/>
								<button class="btn btn-outline-primary">Thêm vào giỏ</button>
							</form>
						</td>
					</tr>
				</c:forEach>                  
                </tbody>       
              </table> 	
              <div class="paging">
              		<c:forEach begin ="1" end = "${endPage }" var = "i">
              			<a active href="home?index=${i}">${i}</a>
              		</c:forEach>
              </div>
        </div>
        <!--Slider-->
   <div id="carouselExampleIndicators" class="container carousel slide" data-ride="carousel" data-pause="false" style="border-bottom:3px solid black; margin-bottom:1px;">
	<ol class="carousel-indicators">
		<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
		<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
	</ol>
	<div class="carousel-inner">
		<div class="carousel-item active">
			<img class="d-block" src="<c:url value='./template/assets/img/main.jpg' />" alt="First slide">
			<div class="carousel-caption d-md-block text-top">
				<h1>Welcome to AIRFLY Airlines!</h1>
			</div>
		</div>
		<div class="carousel-item">
			<img class="d-block img-fluid" src="<c:url value='template/assets/img/bg.jpg' />" alt="Second slide">
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