package Servlete;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.List;

import entity.Activite;
import entity.Etat;
import entity.Participant;
import entity.Responsable;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ActiviteServiceImpl;
import service.ParticipantServiceImpl;
import service.ResponsableServiceImpl;


@WebServlet(name = "Activite", urlPatterns ={"/Activite"})
public class activiteServlet extends HttpServlet {
	ActiviteServiceImpl activiteImlplementation =new ActiviteServiceImpl();
	ResponsableServiceImpl responsableImlplementation =new ResponsableServiceImpl();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public activiteServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
List<Activite> activites=activiteImlplementation.findAll();
     
		request.setAttribute("AllActivites", activites);
		request.setAttribute("AllResponsable", responsableImlplementation.findAll());
		request.setAttribute("AllActivitesDesactive", activiteImlplementation.findActiviteDesactive());
		 request.getRequestDispatcher("Activite.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		Activite activite=new Activite();
		
		String titre=request.getParameter("titre");
		String type=request.getParameter("Type");
		String action=request.getParameter("action");
		
		
		String dateDebut=request.getParameter("dateDebut");
		
		
		String dateFin=request.getParameter("dateFin");
	
	
		
	

		
		
		

		if("ajouter".equalsIgnoreCase(action))
		{
			activite.setDateDebutActivite(dateDebut);
			activite.setDateFinActivite(dateFin);
			activite.setTitre(titre);
			activite.setType(type);
			activite.setEtat(Etat.Active);
			String id_responsable=request.getParameter("responsable");
			int idRes=Integer.parseInt(id_responsable);
			Responsable responsable=responsableImlplementation.findById(idRes);
			activite.setResponsable(responsable);
			activiteImlplementation.add(activite);
			
			System.out.println ("Creation succes" );
		doGet(request, response);
		}else if("modifier".equalsIgnoreCase(action))
		{
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			Activite activite1=activiteImlplementation.findById(id);
			activite1.setDateDebutActivite(dateDebut);
			activite1.setDateFinActivite(dateFin);
			activite1.setTitre(titre);
			activite1.setType(type);
			String id_responsable=request.getParameter("responsable");
			int idRes=Integer.parseInt(id_responsable);
			Responsable responsable=responsableImlplementation.findById(idRes);
			activite1.setResponsable(responsable);
			activiteImlplementation.edite(activite1);
			doGet(request, response);
		}
		else if("supprimer".equalsIgnoreCase(action))
		{
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			
			
			activiteImlplementation.delete(id);
			doGet(request, response);
		}
		else if("modRedirect".equalsIgnoreCase(action))
		{
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			
			Activite ActiviteAediter=activiteImlplementation.findById(id);
			request.setAttribute("Activite", ActiviteAediter);
			
			request.setAttribute("Responsable", responsableImlplementation.findAll());
			request.getRequestDispatcher("EditActivite.jsp").forward(request, response);
			
			
		}
		else if("activer".equalsIgnoreCase(action))
		{
			
			
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			
			
			activiteImlplementation.reactive(id);
			
		doGet(request, response);
		}
		
		
		
		
		
		
		
		
	}

}
