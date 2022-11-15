package Servlete;

import java.io.IOException;

import entity.Activite;
import entity.Etat;
import entity.Exercice;
import entity.Responsable;
import entity.Role;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ActiviteServiceImpl;
import service.ExerciceService;
import service.ExerciceServiceImpl;
import jakarta.servlet.ServletException;
@WebServlet(name = "Exercice", urlPatterns ={"/Exercice"})
public class exerciceServlet extends HttpServlet {
	ExerciceService exerciceImplementation=new ExerciceServiceImpl();
	ActiviteServiceImpl activiteImlplementation =new ActiviteServiceImpl();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public exerciceServlet() {
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("AllExercice", exerciceImplementation.findAll());
		request.setAttribute("AllActivites", activiteImlplementation.findAll());
		 request.getRequestDispatcher("Exercice.jsp").forward(request, response);
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub;
		String annee=request.getParameter("annee");
		String dateDebut=request.getParameter("dateDebut");
		String dateFin=request.getParameter("dateFin");
		String Status=request.getParameter("Status");
		String action=request.getParameter("action");
		Exercice exercice=new Exercice();

		if("ajouter".equalsIgnoreCase(action))
		{
			exercice.setAnnee(annee);
			exercice.setDateDebut(dateDebut);
			exercice.setDateFin(dateFin);
			exercice.setStatus(Status);
			String id_activite=request.getParameter("activite");
			int idRes=Integer.parseInt(id_activite);
			Activite activite=activiteImlplementation.findById(idRes);
			exercice.setActivite(activite);
			exerciceImplementation.add(exercice);
			
			System.out.println ("Creation succes" );
		doGet(request, response);
		}else if("modifier".equalsIgnoreCase(action))
		{
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			Exercice exercice1=exerciceImplementation.findById(id);
			exercice1.setAnnee(annee);
			exercice1.setDateDebut(dateDebut);
			exercice.setDateFin(dateFin);
			exercice1.setStatus(Status);
			String id_responsable=request.getParameter("responsable");
			int idRes=Integer.parseInt(id_responsable);
			Responsable responsable=responsableImlplementation.findById(idRes);
			exercice.setResponsable(responsable);
			exerciceImplementation.edite(activite1);
			doGet(request, response);
		}
		else if("supprimer".equalsIgnoreCase(action))
		{
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			
			
			exerciceImplementation.delete(id);
			doGet(request, response);
		}
		else if("modRedirect".equalsIgnoreCase(action))
		{
			String idSTR=request.getParameter("id");
			int id=Integer.parseInt(idSTR);
			
			Exercice ExerciceAediter=exerciceImplementation.findById(id);
			request.setAttribute("Exercice", ExerciceAediter);
			
			request.setAttribute("AllExercices", exerciceImplementation.findAll());request.getRequestDispatcher("EditExercice.jsp").forward(request, response);
			
			
		}
	
		
	}

}
