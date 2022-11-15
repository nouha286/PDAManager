package repositry;

import java.util.List;

import Dao.ExerciceDao;
import Dao.ExerciceDaoImpl;
import entity.Exercice;

public class ExerciceRepoImpl implements ExerciceRepo {
 ExerciceDao exerciceImpl=new ExerciceDaoImpl();
	public Exercice add(Exercice exercice) {
		// TODO Auto-generated method stub
		return exerciceImpl.add(exercice);
	}

	public Exercice edite(Exercice exercice) {
		// TODO Auto-generated method stub
		return exerciceImpl.edite(exercice);
	}

	public void delete(int id) {
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
