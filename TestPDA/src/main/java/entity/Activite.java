package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.TableGenerator;



@Entity
@TableGenerator(name="activite")
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
	private Date dateDebutActivite;
	private Date dateFinActivite;
	
	
	
	
	  @ManyToMany(mappedBy = "activites")
	  private List<Participant> participants = new ArrayList<Participant>();
	

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

	public Date getDateDebutActivite() {
		return dateDebutActivite;
	}

	public void setDateDebutActivite(Date dateDebutActivite) {
		this.dateDebutActivite = dateDebutActivite;
	}

	public Date getDateFinActivite() {
		return dateFinActivite;
	}

	public void setDateFinActivite(Date dateFinActivite) {
		this.dateFinActivite = dateFinActivite;
	}

	


	public Activite(Integer id, String titre, String type, Date dateDebutActivite, Date dateFinActivite,
			 List<Participant> participants) {
		super();
		this.id = id;
		this.titre = titre;
		this.type = type;
		this.dateDebutActivite = dateDebutActivite;
		this.dateFinActivite = dateFinActivite;
		
		this.participants = participants;
	}

	public Activite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
