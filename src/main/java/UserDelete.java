import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "UserDelete", value = "/user/delete")
public class UserDelete extends HttpServlet {
	
	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDao userDao = new UserDao();
		int id = Integer.parseInt(request.getParameter("id"));
		userDao.delete(id);
		response.sendRedirect("/user/list");
		
		
	}
	
	@Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
