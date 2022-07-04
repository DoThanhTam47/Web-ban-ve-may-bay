package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TicketDao;
import model.TicketModel;


@WebServlet("/home")
public class BookTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processPage(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void processPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
			String indexString = request.getParameter("index");
			int index = Integer.parseInt(indexString);
			
			TicketDao ticketDao = new TicketDao();
			List<TicketModel> list = ticketDao.getAllTickets(index);
			
			request.setAttribute("lists", list);
			
			int count = ticketDao.countAllTicket();
			int pageSize = 5;
			int endPage = 0;
			
			endPage = count / pageSize;
			if(count % pageSize != 0) {
				endPage++;
			}
			
			request.setAttribute("endPage", endPage);

			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
