import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = Persistence.createEntityManagerFactory("TestPDA").createEntityManager();
		System.out.println("done");

	}

}
