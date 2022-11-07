package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
@DiscriminatorValue("Participant")

public class Participant extends Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;
	private String domaine;
	private String structure;
	
	@ManyToMany 
	@JoinTable(name = "participant_activite",
            joinColumns = @jakarta.persistence.JoinColumn (name = "participant_id"),
            inverseJoinColumns =  @jakarta.persistence.JoinColumn (name = "activite_id"))
	private List<Activite> activites=new ArrayList<Activite>();
	
	public Participant(String domaine, String structure) {
		super();
		this.domaine = domaine;
		this.structure = structure;
	}
	
	
	public Participant() {
		
	}


	public Participant(Integer id, String nom, String prenom, String tele, Etat etat, Role role) {
		super(id, nom, prenom, tele, etat, role);
		// TODO Auto-generated constructor stub
	}

	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
