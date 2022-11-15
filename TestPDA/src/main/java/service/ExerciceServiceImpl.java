package service;

import java.util.List;

import entity.Exercice;
import repositry.ExerciceRepo;
import repositry.ExerciceRepoImpl;

public class ExerciceServiceImpl implements ExerciceService{
	ExerciceRepo exerciceImpl=new ExerciceRepoImpl();
	public Exercice add(Exercice exercice) {
		// TODO Auto-generated method stub
		return exerciceImpl.add(exercice);
	}

	public Exercice edite(Exercice exercice) {
		// TODO Auto-generated method stub
		return exerciceImpl.edite(exercice);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		exerciceImpl.delete(id);
	}

	public List<Exercice> findAll() {
		// TODO Auto-generated method stub
		return exerciceImpl.findAll();
	}

	public Exercice findById(int id) {
		// TODO Auto-generated method stub
		return exerciceImpl.findById(id);
	}
	

}
