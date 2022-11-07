package repositry;

import Dao.AdminDao;
import Dao.adminDaoImpl;
import entity.Admin;


public class adminRepoImpl implements AdminRepo {

	AdminDao adminDao = new adminDaoImpl();
	
	public Admin add(Admin admin) {
		
		return adminDao.add(admin);
	}

}
