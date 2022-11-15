package repositry;

import java.util.ArrayList;
import java.util.List;

import entity.Activite;
import entity.Participant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class SearchRepoImpl implements SearchRepo {

	public List<Participant> search(String nameActivite) {
		System.out.println("name passsed to SearchRepoImpl is "+nameActivite);
		
//		String queryString = "SELECT p from participant p "
//				+ "INNER JOIN participant_activite a ON a.participant_id = p.id "
//				+ "INNER JOIN activite t ON t.id = a.activite_id WHERE a.titre='"+nameActivite+"'";
		
		String queryString = "SELECT a FROM Activite a WHERE a.titre='"+nameActivite+"'";
				
		EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager = entityFactory.createEntityManager();
		Query query = entityManager.createQuery(queryString,Activite.class);
		//query.setParameter("activityName", nameActivite);
		try {
		return ((Activite)query.getSingleResult()).getParticipants();	
//			return query.getResultList();
		}catch(Exception e) {
			e.printStackTrace();
			return new ArrayList<Participant>();
		}
	}

}
