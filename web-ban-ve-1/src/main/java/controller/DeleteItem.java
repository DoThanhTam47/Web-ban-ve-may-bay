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

import model.Item;


public class DeleteItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		int idItem = Integer.parseInt(id);
		
		HashMap<Integer, Item> cart = (HashMap<Integer, Item>) session.getAttribute("cart");

		if(cart.containsKey(idItem)) {
			cart.remove(idItem);
		} else {
			session.setAttribute("cart", cart);

			response.sendRedirect("Cart");
		}
		
		int total = 0;
		for (Map.Entry<Integer, Item> entry : cart.entrySet()) {
			total += entry.getValue().getQuantity() * entry.getValue().getTicket().getGia();
		}
		
		session.setAttribute("total", total);
		session.setAttribute("cart", cart);

		response.sendRedirect("Cart");
	}

}
