package Dao;



import entity.admin;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class adminDaoImpl implements AdminDao {

	
	public admin add(admin Admin) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPDA");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(Admin);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Admin;
	}

}
