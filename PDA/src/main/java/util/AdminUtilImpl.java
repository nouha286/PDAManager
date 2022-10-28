package util;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Entity.admin;
import dao.AdminDao;
import dao.AdminDaoImpl;
import hiberConfig.HibernateFactory;
public class AdminUtilImpl implements AdminUtil {
		
	AdminDao AdminDao = new AdminDaoImpl();
	@Override
	public int login(String Email, String Password) {
		
		admin user = new AdminUtilImpl().findByEmail(Email);
		
        if(user.getEmail() == null){return 0;}
        return  (user.getPassword().equals(Password)) ? 1 : 2;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public admin findByEmail(String Email) {
		
		 Session session = HibernateFactory.getInstance().getSession().openSession();
	        session.beginTransaction();
	        Query<admin> query = session.createQuery("from user where email =:email",admin.class);
	        query.setParameter("email", Email);

	       admin admin = query.getSingleResult();

	session.close();

	        return admin;
	}

}
