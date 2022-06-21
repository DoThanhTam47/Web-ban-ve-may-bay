package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.UserModel;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		authentiacte(request, response);
	}
	
	private void authentiacte(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		UserModel user = null;
		
		String email = request.getParameter("email");
        String password = request.getParameter("password");
		user = userDao.findByEmailAndPassword(email, password);
		
		if(user != null) {
			if(user.getRoleId() == 1) {
				
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("fullNameAdmin", user.getFullName());
				
				response.sendRedirect("admin-home");
				
			} else if (user.getRoleId() != 1){
				
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("fullName", user.getFullName());
				
				response.sendRedirect("home");
			}
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
			rd.forward(request, response);
		}
	}

}
