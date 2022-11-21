package Servlete;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.AdminService;
import service.AdminServiceImpl;



@WebServlet(name = "loginServlets", urlPatterns ={"/login"})
public class loginServlet extends HttpServlet {
	AdminService auth = new AdminServiceImpl();
	private static final long serialVersionUID = 1L;


    
    public loginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  String username = request.getParameter("username");
	        String password = request.getParameter("password");

//	        System.out.println(auth.login(username, password));
	       if(username.isEmpty() || password.isEmpty()) {
	    	   request.getRequestDispatcher("login.jsp").forward(request, response);
	       }else {
	    	   
	    	   if (auth.login(username, password) == 1) {
		            long adminId = new AdminServiceImpl().findByEmail(username).getId();
//		            HttpSession session = request.getSession();
//		            session.setAttribute("adminId" , adminId );

		            request.getRequestDispatcher("home.jsp").forward(request, response);
		        } else {
//		            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
//		            rd.include(request,response);
		            request.getRequestDispatcher("login.jsp").forward(request, response);
		        }
	       }
	       
	    }
	     
	 
}
