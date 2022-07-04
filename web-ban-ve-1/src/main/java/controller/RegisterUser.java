package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;


public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/web/form-register.jsp");
        dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
        String fullName = request.getParameter("fullName");
        String password = request.getParameter("password");
        String phoneNumber = request.getParameter("phoneNumber");
        
        UserDao dao = new UserDao();
        dao.insertUser(email, fullName, password, phoneNumber,"2");
        
        request.setAttribute("NOTIFICATION", "Đăng ký thành công!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/web/form-register.jsp");
        dispatcher.forward(request, response);
	}

}
