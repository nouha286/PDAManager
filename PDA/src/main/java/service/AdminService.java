package service;

import Entity.admin;

public interface AdminService {
	
	  	int login(String Email, String Password);
	    void logout();
	    admin findByEmail(String Email);
}
