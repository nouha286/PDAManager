package Dao;

import java.util.List;

import entity.Etat;

import entity.Responsable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ResponsableDaoImpl implements ResponsableDao {

	public Responsable add(Responsable responsable) {
		// TODO Auto-generated method stub
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
				EntityManager entityManager=emf.createEntityManager();
				entityManager.getTransaction().begin();
				entityManager.persist(responsable);
				entityManager.getTransaction().commit();
				entityManager.close();
				return responsable;
	}

	public Responsable edite(Responsable responsable) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
	
		entityManager.merge(responsable);
		entityManager.getTransaction().commit();
		entityManager.close();
		return responsable;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		Responsable responsable=entityManager.find(Responsable.class, id);
		responsable.setEtat(Etat.Desactive);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

	public List<Responsable> findAll() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		

		TypedQuery<Responsable> query1 = entityManager.createNamedQuery("Responsable.findAll", Responsable.class);

		return query1.getResultList(); 		
	}

	public Responsable findById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		return  entityManager.find(Responsable.class, id);
	}

	public void reactive(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		Responsable responsable=entityManager.find(Responsable.class, id);
		responsable.setEtat(Etat.Active);
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public List<Responsable> findResponsableDesactive() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		

		TypedQuery<Responsable> query1 = entityManager.createNamedQuery("NonResponsable.findAll", Responsable.class);

		return query1.getResultList(); 	
	}

}
