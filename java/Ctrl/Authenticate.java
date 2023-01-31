package Ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.UserBean;
import model.Usermodel;

public class Authenticate {
	private static final long serialVersionUID = 1L;

	public Authenticate() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
               
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("text/html");
		HttpSession s=request.getSession();
		String email=request.getParameter("email");
		String psw=request.getParameter("psw");
		
		UserBean b=new UserBean();
		Usermodel m=new Usermodel();
		
		
		
		
	}
}
