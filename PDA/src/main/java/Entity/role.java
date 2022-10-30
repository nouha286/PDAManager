package Entity;

public enum role {

	Admin("Admin"),Responsable("Responsable"),Participant("Participant");
	
	private String name;
	
	
	private role(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
