package br.ifsp.javawebdb.servlet;

import java.io.IOException;

import br.ifsp.javawebdb.dao.UserDAO;
import br.ifsp.javawebdb.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		UserDAO userDao = new UserDAO();
		
		user.setName(req.getParameter("txtName"));
		user.setEmail(req.getParameter("txtEmail"));
		user.setPassword(req.getParameter("txtPassword"));
		
		if(userDao.register(user)) {
			resp.sendRedirect("login.jsp");
		} else {
			resp.sendRedirect("register.html");
		}
	}
}
