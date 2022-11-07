package entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.TableGenerator;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@TableGenerator(name="User")
public abstract class user implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	
	
	private Integer id;
	private String nom;
	private String prenom;
	private String tele;
	
	public user() {}
	
	public user(Integer id, String nom, String prenom, String tele) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tele = tele;
	}
	
	@Column(name="user_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	@Override
	public String toString() {
		return "user [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", tele=" + tele + "]";
	}

	
	
	

}
