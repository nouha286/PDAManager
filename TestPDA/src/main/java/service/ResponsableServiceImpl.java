package service;

import java.util.List;

import entity.Responsable;
import repositry.ResponsableRepo;
import repositry.ResponsableRepoImpl;

public class ResponsableServiceImpl implements ResponsableService{

	ResponsableRepo responsableRepo=new ResponsableRepoImpl();
	
	public Responsable add(Responsable participant) {
		// TODO Auto-generated method stub
		return responsableRepo.add(participant);
	}

	public Responsable edite(Responsable participant) {
		// TODO Auto-generated method stub
		return responsableRepo.edite(participant);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		responsableRepo.delete(id);
	}

	public List<Responsable> findAll() {
		// TODO Auto-generated method stub
		return responsableRepo.findAll();
	}

	public Responsable findById(int id) {
		// TODO Auto-generated method stub
		return responsableRepo.findById(id);
	}

	public void reactive(int id) {
		// TODO Auto-generated method stub
		responsableRepo.reactive(id);
	}

	public List<Responsable> findResponsableDesactive() {
		// TODO Auto-generated method stub
		return responsableRepo.findResponsableDesactive();
	}

}
