package util;

import Entity.admin;

public interface AdminUtil {

	    int login(String Email, String Password);
	    void logout();
	    admin findByEmail(String Email);
}
