package controller;

import java.io.IOException;
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


@WebServlet("/bookTicket")
public class BookTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private InterfaceTicketDao interfaceTicketDao;

	public void init() {
		interfaceTicketDao = new TicketDaoImpl();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<TicketModel> listTicket = interfaceTicketDao.selectAllTickets();
		request.setAttribute("listTicket", listTicket);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/list-ticket.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
