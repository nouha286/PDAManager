package Dao;

import java.util.List;

import entity.Etat;
import entity.Exercice;
import entity.Participant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ExerciceDaoImpl implements ExerciceDao {

	public Exercice add(Exercice exercice) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(exercice);
		entityManager.getTransaction().commit();
		entityManager.close();
		return exercice;
	}

	public Exercice edite(Exercice exercice) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
	
		entityManager.merge(exercice);
		entityManager.getTransaction().commit();
		entityManager.close();
		return exercice;
	}

	public void delete(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		Exercice exercice=entityManager.find(Exercice.class, id);
		entityManager.remove(exercice);
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public List<Exercice> findAll() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		

		TypedQuery<Exercice> query1 = entityManager.createNamedQuery("Exercice.findAll", Exercice.class);

		return query1.getResultList(); 
	}

	public Exercice findById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPDA");
		EntityManager entityManager=emf.createEntityManager();
		entityManager.getTransaction().begin();
		return  entityManager.find(Exercice.class, id);
	}

	
	
	

}
