package entity;

public enum Role {
	Admin("Admin"),
	Responsable("Responsable"),
	Participant("Responsable");
	
	String name;
	
	Role(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
