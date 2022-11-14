package repositry;

import entity.admin;


public interface AdminRepo {

		admin add(admin admin);
		int login(String Email, String Password);
		admin findByEmail(String Email);
}
