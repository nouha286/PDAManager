package service;

import entity.Admin;

import repositry.AdminRepo;
import repositry.adminRepoImpl;

public class AdminServiceImpl implements AdminService {

	
	AdminRepo adminrepo = new adminRepoImpl();
	public Admin add(Admin admin) {
		return adminrepo.add(admin);
	}

}
