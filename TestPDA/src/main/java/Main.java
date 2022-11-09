import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EntityManager em = Persistence.createEntityManagerFactory("TestPDA").createEntityManager();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPDA");
        EntityManager entityManager = emf.createEntityManager();
        
		System.out.println("done");

	}

}
