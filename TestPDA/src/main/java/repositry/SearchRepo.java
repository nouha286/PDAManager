package repositry;

import java.util.List;

import entity.Participant;

public interface SearchRepo {

	public List<Participant> search(String nameActivite);
}
