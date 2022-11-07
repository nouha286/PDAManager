package entity;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;



@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="user_id")
public abstract class Utilisateur implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private String tele;
	
	 @Enumerated(EnumType.STRING)
	private Etat etat;

	 @Enumerated(EnumType.STRING)
	private Role role;
	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
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


	public Etat getEtat() {
		return etat;
	}


	public void setEtat(Etat etat) {
		this.etat = etat;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Utilisateur(Integer id, String nom, String prenom, String tele, Etat etat, Role role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tele = tele;
		this.etat = etat;
		this.role = role;
	}
	 
	

}
