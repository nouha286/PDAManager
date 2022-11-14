package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.TableGenerator;



@Entity
@TableGenerator(name="activite")
@NamedQuery(    name = "Activite.findAll",  query = "from Activite e where e.etat = 'Active'"  )  
@NamedQuery(    name = "NonActivite.findAll",  query = "from Activite e where e.etat = 'Desactive'"  )
public class Activite  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private String type;
	private String dateDebutActivite;
	private String dateFinActivite;
	
	@Enumerated(EnumType.STRING)
	private Etat etat;
	
	
	  public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	@ManyToMany(mappedBy = "activites")
	  private List<Participant> participants = new ArrayList<Participant>();
	@OneToOne
	  @JoinColumn(name = "responsable_id" )
	   Responsable responsable;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	


	

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public Activite(Integer id, String titre, String type, String dateDebutActivite, String dateFinActivite, Etat etat,
			List<Participant> participants) {
		super();
		this.id = id;
		this.titre = titre;
		this.type = type;
		this.dateDebutActivite = dateDebutActivite;
		this.dateFinActivite = dateFinActivite;
		this.etat = etat;
		this.participants = participants;
	}

	public String getDateDebutActivite() {
		return dateDebutActivite;
	}

	public void setDateDebutActivite(String dateDebutActivite) {
		this.dateDebutActivite = dateDebutActivite;
	}

	public String getDateFinActivite() {
		return dateFinActivite;
	}

	public void setDateFinActivite(String dateFinActivite) {
		this.dateFinActivite = dateFinActivite;
	}

	public Activite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
