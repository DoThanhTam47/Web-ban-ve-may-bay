package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.UserModel;

@WebServlet("/add-admin")
public class AddAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/form-add-admin.jsp");
        dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		addAdmin(request, response);
	}
	
	private void addAdmin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       
		String email = request.getParameter("email");
        String fullName = request.getParameter("fullName");
        String password = request.getParameter("password");
        String phoneNumber = request.getParameter("phoneNumber");


        UserModel user = new UserModel();
        user.setEmail(email);
        user.setFullName(fullName);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);
        user.setRoleId(1);

        try {
            int result = userDao.addAdmin(user);
            if (result == 1) {
                request.setAttribute("NOTIFICATION", "Thêm admin thành công!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/addAdmin.jsp");
        dispatcher.forward(request, response);    
        
	}

}
