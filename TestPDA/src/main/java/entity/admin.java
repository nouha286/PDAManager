package entity;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Admin")
public class Admin extends Utilisateur implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String login;
	private String email;
	private String password;
	
	public Admin() {}
	
	

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



	public Admin(Integer id, String nom, String prenom, String tele, Etat etat, Role role) {
		super(id, nom, prenom, tele, etat, role);
		// TODO Auto-generated constructor stub
	}
	
	
}