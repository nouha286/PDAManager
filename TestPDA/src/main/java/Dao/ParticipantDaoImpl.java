package Dao;


import java.util.List;

import entity.Etat;
import entity.Participant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ParticipantDaoImpl implements ParticipantDao {

	public Participant add(Participant participant) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(participant);
		entityManager.getTransaction().commit();
		entityManager.close();
		return participant;
	}

	public Participant edite(Participant participant) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
	
		entityManager.merge(participant);
		entityManager.getTransaction().commit();
		entityManager.close();
		return participant;
	}

	public void delete(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		Participant participant=entityManager.find(Participant.class, id);
		participant.setEtat(Etat.Desactive);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
		
		
	}

	public List<Participant> findAll() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		

		TypedQuery<Participant> query1 = entityManager.createNamedQuery("Participant.findAll", Participant.class);

		return query1.getResultList(); 		
	}
	
	
	public List<Participant> findParticipantDesactive() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		

		TypedQuery<Participant> query1 = entityManager.createNamedQuery("NonParticipant.findAll", Participant.class);

		return query1.getResultList(); 		
	}

	public Participant findById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		return  entityManager.find(Participant.class, id);
		 
	}

	public void reactive(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		Participant participant=entityManager.find(Participant.class, id);
		participant.setEtat(Etat.Active);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}



	
	
	

}
