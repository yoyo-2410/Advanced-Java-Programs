import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/userservlet")
public class userservlet extends HttpServlet {

private final String USERNAME="admin";
private final String PASSWORD="12345";

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException,IOException {

response.setContentType("text/html");
PrintWriter out=response.getWriter();

String username=request.getParameter("username");
String password=request.getParameter("password");

out.println("<html><body>");

if(USERNAME.equals(username)&&PASSWORD.equals(password)) {
out.println("<h2>Login Successful!</h2>");
out.println("<p>Welcome, "+username+"!</p>");
}
else {
out.println("<h2>Login Failed!</h2>");
out.println("<p>Invalid username or password.</p>");
}

out.println("<br><a href='user.html'>Back to Login</a>");
out.println("</body></html>");
}
}
