package entity;

import java.io.Serializable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
@Entity
@NamedQuery(name = "Responsable.findAll",  query = "from Responsable e where e.etat = 'Active'")  
@NamedQuery(name = "NonResponsable.findAll",  query = "from Responsable e where e.etat = 'Desactive'")  
@DiscriminatorValue("Responsable")

public class Responsable extends Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;
	private String type;
	private String domaine;
	@OneToOne
	 @JoinColumn(name = "activite_id")
	private Activite activite;
	
	public Responsable(String type, String domaine) {
		super();
		this.type = type;
		this.domaine = domaine;
	}
	
	public Responsable(Integer id, String nom, String prenom, String tele, Etat etat, Role role) {
		super(id, nom, prenom, tele, etat, role);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
