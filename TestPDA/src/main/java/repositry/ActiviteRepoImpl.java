package repositry;

import java.util.List;

import Dao.ActiviteDao;
import Dao.ActiviteDaoImpl;

import entity.Activite;

public class ActiviteRepoImpl implements ActiviteRepo {
	ActiviteDao activiteDao=new ActiviteDaoImpl();
	
	
	
	public Activite add(Activite activite) {
		
		return activiteDao.add(activite);
	}

	public Activite edite(Activite activite) {
		// TODO Auto-generated method stub
		return activiteDao.edite(activite);
	}

	public void delete(int id) {
		activiteDao.delete(id);
		
	}

	public List<Activite> findAll() {
		// TODO Auto-generated method stub
		return activiteDao.findAll();
	}

	public Activite findById(int id) {
		// TODO Auto-generated method stub
		return activiteDao.findById(id);
	}

	public void reactive(int id) {
		// TODO Auto-generated method stub
		activiteDao.reactive(id);
		
	}

	public List<Activite> findActiviteDesactive() {
		// TODO Auto-generated method stub
		return activiteDao.findActiviteDesactive();
	}

}
