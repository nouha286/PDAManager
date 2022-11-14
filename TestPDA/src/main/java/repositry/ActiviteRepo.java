package repositry;

import java.util.List;

import entity.Activite;

public interface ActiviteRepo {
	
	public Activite add(Activite activite);
	public Activite edite(Activite activite);
	public void delete(int id);
	public List<Activite> findAll();
	public Activite findById(int id);
	public void reactive(int id);
	public List<Activite> findActiviteDesactive();

}
