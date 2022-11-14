package repositry;

import java.util.List;

import Dao.ParticipantDao;
import Dao.ParticipantDaoImpl;
import entity.Participant;

public class ParticipantRepoImpl implements ParticipantRepo {
	ParticipantDao participantDao=new ParticipantDaoImpl();
	
	public Participant add(Participant participant)
	{
		return participantDao.add(participant);
	}

	public Participant edite(Participant participant) {
		
		return participantDao.edite(participant);
	}

	public void delete(int id) {
		 participantDao.delete(id);
		
	}

	public List<Participant> findAll() {
		
		return participantDao.findAll();
	}

	public Participant findById(int id) {
	
		return participantDao.findById(id);
	}

	public void reactive(int id) {
		
		participantDao.reactive(id);
	}

	public List<Participant> findParticipantDesactive() {
		
		return participantDao.findParticipantDesactive();
	}

}
