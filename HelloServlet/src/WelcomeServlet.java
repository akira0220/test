import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
public WelcomeServlet() {
super();
}

protected void doPost(HttpServletRequest request, HttpServletResponse responce)throws
ServletException,IOException{
	request.setCharacterEncoding("UTF-8");
	responce.setContentType("text/html; charset=UTF-8");
	String username = request.getParameter("username");


	System.out.println(username);
	PrintWriter out=responce.getWriter();

	out.println("<html><head></head><body><br>"+username+"����A�悤����!</body></html>");
}
}




