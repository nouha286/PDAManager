package service;

import java.util.List;

import entity.Participant;
import repositry.ParticipantRepo;
import repositry.ParticipantRepoImpl;

public class ParticipantServiceImpl implements ParticipantService {

	ParticipantRepo participantRepoImpl=new ParticipantRepoImpl();
	
	public Participant add(Participant participant) {
		
	
		return participantRepoImpl.add(participant);
	}

public Participant edite(Participant participant) {
		
		return participantRepoImpl.edite(participant);
	}

	public void delete(int id) {
		 participantRepoImpl.delete(id);
		
	}

	public List<Participant> findAll() {
		
		return participantRepoImpl.findAll();
	}

	public Participant findById(int id) {
	
		return participantRepoImpl.findById(id);
	}

	public void reactive(int id) {
		participantRepoImpl.reactive(id);
		
	}

	public List<Participant> findParticipantDesactive() {
		
		return participantRepoImpl.findParticipantDesactive();
	}

}
