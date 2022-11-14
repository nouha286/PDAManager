package Servlete;

import java.io.IOException;
import java.util.List;

import entity.Activite;
import entity.Etat;
import entity.Participant;
import entity.Role;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ActiviteServiceImpl;
import service.ParticipantServiceImpl;

@WebServlet(name = "participant", urlPatterns ={"/participant"})
public class ParticipantServlet extends HttpServlet {
	
	ParticipantServiceImpl participantImlplementation =new ParticipantServiceImpl();
	ActiviteServiceImpl activiteImlplementation =new ActiviteServiceImpl();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ParticipantServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Participant> partitipants=participantImlplementation.findAll();
		
		request.setAttribute("AllParticipants", partitipants);
		request.setAttribute("AllParticipantsDesactive", participantImlplementation.findParticipantDesactive());
		request.setAttribute("AllActivites", activiteImlplementation.findAll());
		 request.getRequestDispatcher("Participant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println ("1");
		 
		
			Participant participant = new Participant();

			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String tele = request.getParameter("tele");
			String email=request.getParameter("email");
			String domaine=request.getParameter("domaine");
			String structure=request.getParameter("structure");
			String action=request.getParameter("action");
			String[] test=request.getParameterValues("activite");
		
			if("ajouter".equalsIgnoreCase(action))
			{
				participant.setNom(nom);
				participant.setPrenom(prenom);
				participant.setTele(tele);
				participant.setDomaine(domaine);
				participant.setEmail(email);
				participant.setEtat(Etat.Active);
				participant.setRole(Role.Participant);
				participant.setStructure(structure);
				List<Activite> activites=null;
				
				for(String tes: test)
				{
					String idSTRA=request.getParameter("activite");
					int id=Integer.parseInt(tes);
					Activite activite=activiteImlplementation.findById(id);
					
					activites.add(activite);
				}
				participant.setActivites(activites);
				
				participantImlplementation.add(participant);
				System.out.println ("Creation succes" );
			doGet(request, response);
			}
			
			
			
			else if("modifier".equalsIgnoreCase(action))
			{
				String idSTR=request.getParameter("id");
				int id=Integer.parseInt(idSTR);
				Participant partAediter=participantImlplementation.findById(id);
				partAediter.setNom(nom);
				partAediter.setPrenom(prenom);
				partAediter.setTele(tele);
				partAediter.setDomaine(domaine);
				partAediter.setEmail(email);
				partAediter.setEtat(Etat.Active);
				partAediter.setRole(Role.Participant);
				partAediter.setStructure(structure);
				participantImlplementation.edite(partAediter);
				doGet(request, response);
				
			
				
			}
			
			
			else if("supprimer".equalsIgnoreCase(action))
			{
				
				
				String idSTR=request.getParameter("id");
				int id=Integer.parseInt(idSTR);
				
				
				participantImlplementation.delete(id);
				
			doGet(request, response);
			}
			else if("modRedirect".equalsIgnoreCase(action))
			{
				String idSTR=request.getParameter("id");
				int id=Integer.parseInt(idSTR);
				
				Participant partAediter=participantImlplementation.findById(id);
				request.setAttribute("Participant", partAediter);
				request.getRequestDispatcher("EditParticipant.jsp").forward(request, response);
				
				
			}
			else if("activer".equalsIgnoreCase(action))
			{
				
				
				String idSTR=request.getParameter("id");
				int id=Integer.parseInt(idSTR);
				
				
				participantImlplementation.reactive(id);
				
			doGet(request, response);
			}
			
			
			

			
	}

}
