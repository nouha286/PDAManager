package service;

import java.util.List;

import entity.Activite;
import repositry.ActiviteRepo;
import repositry.ActiviteRepoImpl;




public class ActiviteServiceImpl implements  ActiviteService{
	ActiviteRepo participantRepoImpl=new ActiviteRepoImpl();
	
	public Activite add(Activite activite) {
		// TODO Auto-generated method stub
		return participantRepoImpl.add(activite);
	}

	public Activite edite(Activite activite) {
		// TODO Auto-generated method stub
		return participantRepoImpl.edite(activite);
	}

	public void delete(int id) {
		participantRepoImpl.delete(id);
		
	}

	public List<Activite> findAll() {
		// TODO Auto-generated method stub
		return participantRepoImpl.findAll();
	}

	public Activite findById(int id) {
		// TODO Auto-generated method stub
		return participantRepoImpl.findById(id);
	}

	public void reactive(int id) {
		participantRepoImpl.reactive(id);
		
	}

	public List<Activite> findActiviteDesactive() {
		// TODO Auto-generated method stub
		return participantRepoImpl.findActiviteDesactive();
	}

	
	

}
