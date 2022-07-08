import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "UserList", value = "/user/list")
public class UserList extends HttpServlet {
	
	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		UserDao userDao = new UserDao();
		request.setAttribute("users", userDao.findAll());
	
		getServletContext().getRequestDispatcher("/user/list.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
