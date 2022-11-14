package Dao;

import java.util.List;

import entity.Activite;
import entity.Etat;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ActiviteDaoImpl implements ActiviteDao {

	public Activite add(Activite activite) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(activite);
		entityManager.getTransaction().commit();
		entityManager.close();
		return activite;
	}

	public Activite edite(Activite activite) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
	
		entityManager.merge(activite);
		entityManager.getTransaction().commit();
		entityManager.close();
		return activite;
	}

	public void delete(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		Activite activite=entityManager.find(Activite.class, id);
		activite.setEtat(Etat.Desactive);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

	public List<Activite> findAll() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		
		TypedQuery<Activite> query1 = entityManager.createNamedQuery("Activite.findAll", Activite.class);

		return query1.getResultList(); 	
	}

	public Activite findById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		return  entityManager.find(Activite.class, id);
	}

	public void reactive(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		Activite activite=entityManager.find(Activite.class, id);
		activite.setEtat(Etat.Active);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

	public List<Activite> findActiviteDesactive() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		

		TypedQuery<Activite> query1 = entityManager.createNamedQuery("NonActivite.findAll", Activite.class);

		return query1.getResultList(); 	
	}

}
