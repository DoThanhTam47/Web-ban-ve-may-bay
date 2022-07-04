package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TicketDao;
import model.Item;
import model.TicketModel;

public class UpdateQuantityItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	TicketDao ticketDao = new TicketDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		int idItem = Integer.parseInt(id);
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		Item item;
		
		TicketModel ticketModel = ticketDao.getTicketById(id);

		HashMap<Integer, Item> cart = (HashMap<Integer, Item>) session.getAttribute("cart");

		if (cart == null) {
			cart = new HashMap<Integer, Item>();
			item = new Item(quantity, ticketModel);
			cart.put(idItem, item);

		} else {
			if (cart.containsKey(idItem)) {
				if(quantity == 0) {
					cart.remove(idItem);
				} else {
					item = cart.get(idItem);
					item.setQuantity(quantity);
				}
				
			
			} else {
				item = new Item(quantity, ticketModel);
				cart.put(idItem, item);
			}
			
			int total = 0;
			for (Map.Entry<Integer, Item> entry : cart.entrySet()) {
				total += entry.getValue().getQuantity() * entry.getValue().getTicket().getGia();
			}
			
			session.setAttribute("total", total);
		}

		session.setAttribute("cart", cart);

		response.sendRedirect("Cart");

	}

}
