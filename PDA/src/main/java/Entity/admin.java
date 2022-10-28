package Entity;

public class admin extends user {
	
	private String email;
	private String password;
	
	
	public admin() {}
	public admin(int id, String name, String prenom, String tele, boolean etat, role role,String email,String password) {
		super(id, name, prenom, tele, etat, role);
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
