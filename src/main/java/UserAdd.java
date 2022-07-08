import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "UserAdd", value = "/user/add")
public class UserAdd extends HttpServlet {
	
	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/user/addtemp.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDao userDao = new UserDao();
		User user = new User();
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if (username.isBlank() || username.equals(null) || email.isBlank() || email.equals(null) || password.isBlank() || password.equals(null)) {
			response.sendRedirect("/user/add");
		}else{
			user.setUserName(username);
			user.setEmail(email);
			user.setPassword(password);
			
			userDao.create(user);
			response.sendRedirect("/user/list");
		}
		
	}
}
