package entity;

import jakarta.persistence.Entity;

@Entity
public class admin extends user {
	
	private static final long serialVersionUID = 1L;
	private String login;
	private String email;
	private String password;
	
	public admin() {}
	
	public admin(Integer id, String nom, String prenom, String tele,String login,String email,String password) {
		super(id, nom, prenom, tele);
		this.login = login;
		this.email = email;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
	
	public void  setPassword(String password) {
		this.password = password;
	}
	
	
}
