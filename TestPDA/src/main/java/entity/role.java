package entity;

public enum role {
	
	Admin("Admin"),
	Respo("Responsable"),
	participant("participant");
	
	private String name;
	
	role(String name){
		this.name = name;
	}

	 public String toString() {
		 return name;
	}
	
}
