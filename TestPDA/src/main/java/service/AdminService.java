package service;

import entity.admin;

public interface AdminService {
	
	admin add(admin admin);
	int login(String Email, String Password);
	admin findByEmail(String Email);
}
