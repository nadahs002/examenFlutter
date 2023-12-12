package org.isetn.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Matiere {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomMatiere;

	private String DureeH ;




	@ManyToOne
	@JsonIgnore
	@JsonManagedReference
	private Classe classe;

	@OneToMany(mappedBy = "matiere")
	private List<Absence> absences;


}
