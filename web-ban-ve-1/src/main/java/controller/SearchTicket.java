package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TicketDao;
import model.TicketModel;


public class SearchTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processPage(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processPage(request, response);
	}
	
	
	protected void processPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String noiBay = request.getParameter("noiBay");
			String noiDen = request.getParameter("noiDen");
			String ngayBay = request.getParameter("ngayBay");
			String indexString = request.getParameter("index");
			int index = Integer.parseInt(indexString);
			
			TicketDao ticketDao = new TicketDao();
			List<TicketModel> list = ticketDao.searchTickets(noiBay, noiDen, ngayBay, index);
			
			request.setAttribute("lists", list);
			
			int count = ticketDao.count(noiBay, noiDen, ngayBay);
			int pageSize = 5;
			int endPage = 0;
			
			endPage = count / pageSize;
			if(count % pageSize != 0) {
				endPage++;
			}
			
			request.setAttribute("endPage", endPage);
			request.setAttribute("noiBay", noiBay);
			request.setAttribute("noiDen", noiDen);
			request.setAttribute("ngayBay", ngayBay);
			
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/search-page.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
