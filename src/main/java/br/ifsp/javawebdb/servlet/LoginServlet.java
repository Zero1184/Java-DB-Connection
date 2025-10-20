package br.ifsp.javawebdb.servlet;

import java.io.IOException;
import br.ifsp.javawebdb.dao.UserDAO;
import br.ifsp.javawebdb.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/auth")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User(); //Create object user
		UserDAO userDao = new UserDAO(); //Create object userDAO
		HttpSession session = req.getSession();
		user.setEmail(req.getParameter("txtEmail")); 
		user.setPassword(req.getParameter("txtPassword"));
		
		if(userDao.login(user)) {
			session.setAttribute("user", user);
			req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
		} else {
			if(session != null) {
				session.invalidate();
			}
			resp.sendRedirect("login.jsp");
		}
	}
}
