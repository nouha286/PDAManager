package repositry;

import java.util.List;

import entity.Participant;

public interface ParticipantRepo {
	
	public Participant add(Participant participant);
	public Participant edite(Participant participant);
	public void delete(int id);
	public List<Participant> findAll();
	public Participant findById(int id);
	public void reactive(int id);
	public List<Participant> findParticipantDesactive();

}
