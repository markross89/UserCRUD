import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebFilter(filterName = "FilterDecoding", value="/*")
public class FilterDecoding implements Filter {
	
	public void init (FilterConfig config) throws ServletException {
	
	}
	
	public void destroy () {
	
	}
	
	@Override
	public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
		chain.doFilter(request, response);
	}
}
