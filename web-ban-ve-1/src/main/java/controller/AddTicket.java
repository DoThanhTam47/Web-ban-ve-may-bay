package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TicketDao;


public class AddTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/form-ticket.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String gia = request.getParameter("gia");
		String hangGhe = request.getParameter("hangGhe");
		String maMayBay = request.getParameter("maMayBay");
		String ngayBay = request.getParameter("ngayBay");
		String ngayDen = request.getParameter("ngayDen");
		String noiBay = request.getParameter("noiBay");
		String noiDen = request.getParameter("noiDen");
		String thoiGian = request.getParameter("thoiGian");
		
		TicketDao dao = new TicketDao();
		dao.insertTicket(gia, hangGhe, maMayBay, ngayBay, ngayDen, noiBay, noiDen, thoiGian);
		
		request.setAttribute("NOTIFICATION", "Thêm vé thành công!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/form-ticket.jsp");
        dispatcher.forward(request, response);
		
	}

}
