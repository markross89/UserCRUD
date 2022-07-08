import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "UserUpdate", value = "/user/update")
public class UserUpdate extends HttpServlet {
	
	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			UserDao userDao = new UserDao();
			String id = request.getParameter("id");
			User user = userDao.read(Integer.parseInt(id));
			request.setAttribute("user", user);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		getServletContext().getRequestDispatcher("/user/updatetemp.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		UserDao userDao = new UserDao();
		User user = new User();
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if ( username.isBlank() || username.equals(null) || email.isBlank() || email.equals(null) || password.isBlank() || password.equals(null)) {
			response.sendRedirect("/user/update?id="+id);
		}
		else {
			user.setId(id);
			user.setUserName(username);
			user.setEmail(email);
			user.setPassword(password);
			
			userDao.update(user);
			response.sendRedirect("/user/list");
		}
	}
}

