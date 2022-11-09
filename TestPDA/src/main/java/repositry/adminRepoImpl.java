package repositry;

import Dao.AdminDao;

import Dao.adminDaoImpl;
import entity.admin;


public class adminRepoImpl implements AdminRepo {

	AdminDao adminDao = new adminDaoImpl();
	
	public admin add(admin admin) {
		
		return adminDao.add(admin);
	}

}
