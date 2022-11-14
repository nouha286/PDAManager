package repositry;

import java.util.List;


import Dao.ResponsableDao;
import Dao.ResponsableDaoImpl;
import entity.Responsable;

public class ResponsableRepoImpl implements ResponsableRepo{

	ResponsableDao responsableDao=new ResponsableDaoImpl();
	public Responsable add(Responsable participant) {
		// TODO Auto-generated method stub
		return responsableDao.add(participant);
	}

	public Responsable edite(Responsable participant) {
		// TODO Auto-generated method stub
		return responsableDao.edite(participant);
	}

	public void delete(int id) {
		responsableDao.delete(id);
		
	}

	public List<Responsable> findAll() {
		// TODO Auto-generated method stub
		return responsableDao.findAll();
	}

	public Responsable findById(int id) {
		// TODO Auto-generated method stub
		return responsableDao.findById(id);
	}

	public void reactive(int id) {
		responsableDao.reactive(id);
		
	}

	public List<Responsable> findResponsableDesactive() {
		// TODO Auto-generated method stub
		return responsableDao.findResponsableDesactive();
	}

}
