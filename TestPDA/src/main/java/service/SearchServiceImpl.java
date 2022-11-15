package service;

import java.util.List;

import entity.Participant;
import repositry.SearchRepo;
import repositry.SearchRepoImpl;

public class SearchServiceImpl implements SearchService {
	
	SearchRepo sr = new SearchRepoImpl();

	public List<Participant> Search(String nameActivite) {
		return sr.search(nameActivite);
	}

}
