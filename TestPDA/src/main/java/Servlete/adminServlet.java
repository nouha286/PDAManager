package Servlete;

import java.io.IOException;

import entity.Etat;
import entity.Role;
import entity.admin;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.AdminService;
import service.AdminServiceImpl;

@WebServlet(name = "adminServlet", urlPatterns ={"/register"})
public class adminServlet extends HttpServlet {
	
	AdminService ad = new AdminServiceImpl();
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		 request.getRequestDispatcher("/register.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		admin a = new admin();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String tele   = request.getParameter("tele");
		String login  = request.getParameter("login");
		String email   = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(nom.isEmpty() || prenom.isEmpty() || tele.isEmpty() || login.isEmpty() || email.isEmpty() || password.isEmpty()  ) {
			request.setAttribute("error", "Please fill all the fields");
            request.getRequestDispatcher("register.jsp").forward(request, response);
		}else {		
			a.setNom(nom);
			a.setPrenom(prenom);
			a.setTele(tele);
			a.setLogin(login);
			a.setEmail(email);
			a.setPassword(password);
			Role role = Role.Admin;
			a.setRole(role);
			Etat et = Etat.Active;
			a.setEtat(et);
			ad.add(a);
			System.out.println ("Creation succes" );
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
