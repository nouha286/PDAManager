package service;
import java.util.List;

import entity.Exercice;

public interface ExerciceService {
	
		public Exercice add(Exercice exercice);
		public Exercice edite(Exercice exercice);
		public void delete(int id);
		public List<Exercice> findAll();
		public Exercice findById(int id);

}
