package service;

import entity.admin;
import repositry.AdminRepo;
import repositry.adminRepoImpl;

public class AdminServiceImpl implements AdminService {

	
	AdminRepo adminrepo = new adminRepoImpl();
	public admin add(admin admin) {
		return adminrepo.add(admin);
	}
	public int login(String Email, String Password) {
		
		return adminrepo.login(Email, Password);
	}
	public admin findByEmail(String Email) {
		
		return adminrepo.findByEmail(Email);
	}
	
	
	
	

}
