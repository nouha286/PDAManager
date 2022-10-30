package Entity;

public class user {
	
	private int id;
	private String name;
	private String prenom;
	private String tele;
	private boolean etat;
	private role role;
	
	public user() {}

	public user(int id, String name, String prenom, String tele, boolean etat, role role) {
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.tele = tele;
		this.etat = etat;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public role getRole() {
		return role;
	}

	public void setRole(role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", prenom=" + prenom + ", tele=" + tele + ", etat=" + etat
				+ ", role=" + role + "]";
	}
	
	
}
