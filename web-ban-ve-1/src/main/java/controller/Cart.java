package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TicketDao;
import model.Item;
import model.TicketModel;


public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TicketDao  ticketDao = new TicketDao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showCart(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		addToCart(request, response);
	}
	
	
	protected void addToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		int idItem = Integer.parseInt(id);
		TicketModel ticketModel = ticketDao.getTicketById(id);
		Item item;
		
		HashMap<Integer, Item> cart = (HashMap<Integer, Item>) session.getAttribute("cart");
		
		if(cart == null) {
			cart = new HashMap<Integer, Item>();
			item = new Item(1, ticketModel);
			cart.put(idItem, item);
			
		} else {
			if(cart.containsKey(idItem)) {
				item = cart.get(idItem);
				item.incrementQuantity();
			} else {
				item = new Item(1, ticketModel);
				cart.put(idItem, item);
			}
		}
		int total = 0;
		for (Map.Entry<Integer, Item> entry : cart.entrySet()) {
			total += entry.getValue().getQuantity() * entry.getValue().getTicket().getGia();
		}
		
		System.out.println(total);
		
		
		session.setAttribute("total", total);
		session.setAttribute("cart", cart);
		
		response.sendRedirect("Cart");
	}
	
	protected void showCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		HashMap<Integer, Item> cart = (HashMap<Integer, Item>) session.getAttribute("cart");

		request.setAttribute("cart", cart);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/cart.jsp");
		rd.forward(request, response);
	}
	
	

}
