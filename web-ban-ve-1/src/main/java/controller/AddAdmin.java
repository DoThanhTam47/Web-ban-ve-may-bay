package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;


public class AddAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/form-add-admin.jsp");
        dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
        String fullName = request.getParameter("fullName");
        String password = request.getParameter("password");
        String phoneNumber = request.getParameter("phoneNumber");
        
        UserDao dao = new UserDao();
        dao.insertAdmin(email, fullName, password, phoneNumber, "1");
        
        request.setAttribute("NOTIFICATION", "Đăng ký thành công!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/form-add-admin.jsp");
        dispatcher.forward(request, response);
	}

}
