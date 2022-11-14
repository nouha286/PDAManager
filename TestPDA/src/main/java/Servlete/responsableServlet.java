package Servlete;

import java.io.IOException;
import java.util.List;

import entity.Etat;
import entity.Participant;
import entity.Responsable;
import entity.Role;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import service.ResponsableServiceImpl;


@WebServlet(name = "Responsable", urlPatterns ={"/Responsable"})
public class responsableServlet extends HttpServlet {
	ResponsableServiceImpl responsableImlplementation =new ResponsableServiceImpl();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public responsableServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Responsable> responsables=responsableImlplementation.findAll();
		
		request.setAttribute("AllResponsable", responsables);
		request.setAttribute("AllResponsablesDesactive", responsableImlplementation.findResponsableDesactive());
		
		request.getRequestDispatcher("Responsable.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String tele = request.getParameter("tele");
	
		String domaine=request.getParameter("domaine");
		String type=request.getParameter("Type");
		String action=request.getParameter("action");
		
		Responsable responsable=new Responsable();
		
		
		if("ajouter".equalsIgnoreCase(action))
		{
			responsable.setNom(nom);
			responsable.setPrenom(prenom);
			responsable.setTele(tele);
			responsable.setDomaine(domaine);
			
			responsable.setEtat(Etat.Active);
			responsable.setRole(Role.Responsable);
			responsable.setType(type);
			
			
			
			responsableImlplementation.add(responsable);
			System.out.println ("Creation succes" );
		doGet(request, response);
		}
		else if("modifier".equalsIgnoreCase(action))
		{
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			Responsable resAediter=responsableImlplementation.findById(id);
			resAediter.setNom(nom);
			resAediter.setPrenom(prenom);
			resAediter.setTele(tele);
			resAediter.setDomaine(domaine);
	
			resAediter.setType(type);
			responsableImlplementation.edite(resAediter);
			doGet(request, response);
			
		
			
		}
		else if("supprimer".equalsIgnoreCase(action))
		{
			
			
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			
			
			responsableImlplementation.delete(id);
			
		doGet(request, response);
		}
		else if("modRedirect".equalsIgnoreCase(action))
		{
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			
			Responsable resAediter=responsableImlplementation.findById(id);
			request.setAttribute("Responsable", resAediter);
			request.getRequestDispatcher("EditResponsable.jsp").forward(request, response);
			
			
		}
		else if("activer".equalsIgnoreCase(action))
		{
			
			
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			
			
			responsableImlplementation.reactive(id);
			
		doGet(request, response);
		}
	}

}
