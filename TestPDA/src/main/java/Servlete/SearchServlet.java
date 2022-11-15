package Servlete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.Participant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.SearchService;
import service.SearchServiceImpl;

@WebServlet(name = "search", urlPatterns ={"/search"})
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	SearchService sr = new SearchServiceImpl();
    /**
     * Default constructor. 
     */
    public SearchServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 request.getRequestDispatcher("SearchParticipant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nameActivite = request.getParameter("nameActivite");
		List <Participant> lp = sr.Search(nameActivite);
		request.setAttribute("AllActiviti", lp);
//		response.getWriter().write("participant has email "+lp.get(0).toString());
		request.getRequestDispatcher("viewSearch.jsp").forward(request, response);
	    
		//doGet(request, response);
	}

}
