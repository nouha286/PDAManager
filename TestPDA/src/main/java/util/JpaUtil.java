package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;

public static EntityManager getEntityManager(String persistUnit) 
    {
		
		if (entityManager==null)
		{
		 factory = Persistence.createEntityManagerFactory(persistUnit);
		
		  entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
}