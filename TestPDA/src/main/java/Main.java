import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		EntityManager em=Persistence.createEntityManagerFactory("TestPDA").createEntityManager();
=======
//		EntityManager em = Persistence.createEntityManagerFactory("TestPDA").createEntityManager();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPDA");
        EntityManager entityManager = emf.createEntityManager();
        
>>>>>>> develop
		System.out.println("done");

	}

}
