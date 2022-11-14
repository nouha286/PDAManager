package repositry;

import java.util.List;

import entity.Responsable;

public interface ResponsableRepo {
	public Responsable add(Responsable participant);
	public Responsable edite(Responsable participant);
	public void delete(int id);
	public List<Responsable> findAll();
	public Responsable findById(int id);
	public void reactive(int id);
	public List<Responsable> findResponsableDesactive();

}
