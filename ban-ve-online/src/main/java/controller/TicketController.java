package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InterfaceTicketDao;
import dao.TicketDaoImpl;
import model.TicketModel;

@WebServlet(urlPatterns = {"/"})
public class TicketController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private InterfaceTicketDao interfaceTicketDao;

	public void init() {
		interfaceTicketDao = new TicketDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/add-ticket":
				showNewForm(request, response);
				break;
			case "/insert":
				insertTicket(request, response);
				break;
			case "/delete":
				deleteTicket(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateTicket(request, response);
				break;
			case "/quan-ly-ve":
				listTicket(request, response);
				break;
			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("login/login.jsp");
				dispatcher.forward(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void listTicket(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<TicketModel> listTicket = interfaceTicketDao.selectAllTickets();
		request.setAttribute("listTicket", listTicket);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/list-ticket.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/form-ticket.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		int ticketId = Integer.parseInt(request.getParameter("id"));
		TicketModel existingTicket = interfaceTicketDao.selectTicketById(ticketId);

		request.setAttribute("existingTicket", existingTicket);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/form-ticket.jsp");
		dispatcher.forward(request, response);

	}

	private void insertTicket(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		String maMayBay = request.getParameter("maMayBay");
		String noiBay = request.getParameter("noiBay");
		String noiDen = request.getParameter("noiDen");
		String ngayBay = request.getParameter("ngayBay");
		String ngayDen = request.getParameter("ngayDen");
		String thoiGian = request.getParameter("thoiGian");
		String hangGhe = request.getParameter("hangGhe");
		long gia = Long.parseLong(request.getParameter("gia"));

		TicketModel newTicket = new TicketModel(maMayBay, noiBay, noiDen, ngayBay, ngayDen, thoiGian, hangGhe, gia);
        interfaceTicketDao.insertTicket(newTicket);

		response.sendRedirect("add-ticket");
	}

	private void updateTicket(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		int idTicket = Integer.parseInt(request.getParameter("idTicket"));
		String maMayBay = request.getParameter("maMayBay");
		String noiBay = request.getParameter("noiBay");
		String noiDen = request.getParameter("noiDen");
		String ngayBay = request.getParameter("ngayBay");
		String ngayDen = request.getParameter("ngayDen");
		String thoiGian = request.getParameter("thoiGian");
		String hangGhe = request.getParameter("hangGhe");
		long gia = Long.parseLong(request.getParameter("gia"));

		TicketModel newTicket = new TicketModel(maMayBay, noiBay, noiDen, ngayBay, ngayDen, thoiGian, hangGhe, gia);

		interfaceTicketDao.updateTicket(newTicket);

		response.sendRedirect("quan-ly-ve");
	}

	private void deleteTicket(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		interfaceTicketDao.deleteTicket(id);

		response.sendRedirect("quan-ly-ve");
	}
}
