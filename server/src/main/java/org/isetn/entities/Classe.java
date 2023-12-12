package org.isetn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classe {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codClass;
	private String nomClass;
	private int nbreEtud;


	@OneToMany(mappedBy="classe" , cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Etudiant> etudiants;

	@OneToMany(mappedBy="classe" , cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Matiere> matieres;
	@ManyToOne
	private Departement departement;
}