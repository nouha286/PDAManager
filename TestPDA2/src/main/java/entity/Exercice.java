package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Exercice implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date annee;
	private Date dateDebut;
	private Date dateFin;
	private Boolean status;
	
	@ManyToOne
	  @JoinTable(name = "activite_exercice",
	             joinColumns =  @jakarta.persistence.JoinColumn(name = "exercice_id"),
	             inverseJoinColumns =  @jakarta.persistence.JoinColumn(name = "activite_id"))
	 
	  private Activite activite;
	
	
	
}
