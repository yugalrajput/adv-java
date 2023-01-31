package Ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.UserBean;
import model.Usermodel;
@WebServlet(urlPatterns = "/UserCtrl")
public class UserCtrl extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("psw");
		 String date=request.getParameter("date");

		UserBean b = new UserBean();
		Usermodel m = new Usermodel();
		b.setFname(fname);
		b.setLname(lname);
		b.setEmail(email);
		b.setPassword(password);
		 b.setDate(date);
		 
		 PrintWriter out=response.getWriter();
			System.out.println(b.getFname());	 

	
		try {
			b=m.add(b);
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
			
				System.out.println("added");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request1, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request1, response);
	}

}
