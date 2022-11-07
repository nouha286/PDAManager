package Servlete;

import java.io.IOException;
import entity.Admin;
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
		 request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println ("1");
		Admin a = new Admin();
//		int id = Integer.parseInt(request.getParameter("id"));
		String nom = request.getParameter("name");
		String prenom = request.getParameter("prenom");
		String tele = request.getParameter("tele");
		String login = request.getParameter("login");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
//		boolean etat = request.getParameter("etat") != null;
		a.setNom(nom);
		a.setPrenom(prenom);
		a.setTele(tele);
		a.setLogin(login);
		a.setEmail(email);
		a.setPassword(password);
		ad.add(a);
		System.out.println ("Creation succes" );
//		response.getWriter().write("Connte cree");
	}

}
