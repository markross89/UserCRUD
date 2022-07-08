import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "UserInfo", value = "/user/info")
public class UserInfo extends HttpServlet {
	
	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UserDao userDao = new UserDao();
			String id = request.getParameter("id");
			User user = userDao.read(Integer.parseInt(id));
			request.setAttribute("object", user);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		getServletContext().getRequestDispatcher("/user/info.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
