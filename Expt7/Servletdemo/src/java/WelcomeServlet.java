import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class WelcomeServlet extends HttpServlet
{
private static final long serialVersionUID = 1L;
public void init(ServletConfig config) throws ServletException
{
super.init(config);
}


protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException
{
String name = request.getParameter("user");
String welcomeMessage = "Name:"+ name;
String num = request.getParameter("num");
String welcomeMessages = "Age:"+ num;
String phnum = request.getParameter("phnum");
String welcomeMessagess = "PhNumber:"+ phnum;
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title> A very simple servlet example</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1> Server Servlet Response</h1>");
out.println("<h3>"+welcomeMessage+"</h3>");
out.println("<h3>"+welcomeMessages+"</h3>");
out.println("<h3>"+welcomeMessagess+"</h3>");
out.println("</body>");
out.println("</html>");
out.close();
}
}