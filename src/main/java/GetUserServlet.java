
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName").trim();
		if(userName == null || "".equals(userName)){
			userName = "person";
		}
		String userName = request.getParameter("datepicker").trim();
		if(datepicker == null || "".equals(datepicker)){
			datepicker = "DOB";
		}
		
		String greetings = "Hello " + userName + datepicker;
		
		response.setContentType("text/plain");
		response.getWriter().write(greetings);
	}
}
