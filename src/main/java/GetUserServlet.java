import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;

@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  String userName = request.getParameter("userName").trim();
  if (userName == null || "".equals(userName)) {
   userName = "person";
  }
  String datepicker = request.getParameter("datepicker").trim();
  SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
  Calendar c = Calendar.getInstance();

  try {
   Date date = formatter.parse(datepicker);
   System.out.println(date);
   c.setTime(date);
   int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
   System.out.println(formatter.format(date));
   System.out.println(dayOfWeek);

   String mondaysChild;

   switch (dayOfWeek) {
    case 1:
     mondaysChild = "The child who is born on the Sabbath day Is bonnie and blithe and good and gay";
     break;
    case 2:
     mondaysChild = "Monday's child is fair of face";
     break;
    case 3:
     mondaysChild = "Tuesday's child is full of grace";
     break;
    case 4:
     mondaysChild = "Wednesday's child is full of woe";
     break;
    case 5:
     mondaysChild = "Thursday's child has far to go";
     break;
    case 6:
     mondaysChild = "Friday's child is loving and giving";
     break;
    case 7:
     mondaysChild = "Saturday's child works hard for a living";
     break;
    default:
     mondaysChild = "Invalid month";
     break;
   }
  } catch (ParseException e) {
	  e.printStackTrace();
  }



 String greetings = "Hello " + userName +", "+ mondaysChild;

 response.setContentType("text/plain");
 response.getWriter().write(greetings);
}}
