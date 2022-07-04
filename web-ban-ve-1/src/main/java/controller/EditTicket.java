package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TicketDao;
import model.TicketModel;


public class EditTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		TicketDao ticketDao = new TicketDao();
		TicketModel ticket = ticketDao.getTicketById(id);
		request.setAttribute("ticket", ticket);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/form-edit.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ticketId = request.getParameter("id");
		String gia = request.getParameter("gia");
		String hangGhe = request.getParameter("hangGhe");
		String maMayBay = request.getParameter("maMayBay");
		String ngayBay = request.getParameter("ngayBay");
		String ngayDen = request.getParameter("ngayDen");
		String noiBay = request.getParameter("noiBay");
		String noiDen = request.getParameter("noiDen");
		String thoiGian = request.getParameter("thoiGian");
		
		TicketDao dao = new TicketDao();
		dao.updateTicket(ticketId, gia, hangGhe, maMayBay, ngayBay, ngayDen, noiBay, noiDen, thoiGian);
		
		response.sendRedirect("AdminListTicket");
	}

}
