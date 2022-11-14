package repositry;



import Dao.AdminDao;


import Dao.adminDaoImpl;
import entity.admin;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class adminRepoImpl implements AdminRepo {

	AdminDao adminDao = new adminDaoImpl();
	
	public admin add(admin admin) {
		
		return adminDao.add(admin);
	}

	public admin findByEmail(String email) {
		
//		EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("TestPDA");
//	    EntityManager entityManager = entityFactory.createEntityManager();
//	    Query query =  entityManager.createQuery("from admin where email =:email",admin.class);
//	    query.setParameter("email", email);
//	     
//	   return (admin) query.getSingleResult();
		
		
				
			EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("TestPDA");
			EntityManager entityManager = entityFactory.createEntityManager();
			return (admin) entityManager.createQuery("from admin where email =:email",admin.class)
	        .setParameter("email", email)
	        .getSingleResult();
		
	}

	public int login(String Email, String Password) {
		
		 admin ad = new adminRepoImpl().findByEmail(Email);
		 if( ad.getEmail() == null){return 0;}
	        return  (ad.getPassword().equals(Password)) ? 1 : 2;
	}
		
  
}
