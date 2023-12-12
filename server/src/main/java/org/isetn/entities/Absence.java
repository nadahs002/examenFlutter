package org.isetn.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Assuming you want the database to generate the ID
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Matiere matiere;

    @ManyToOne(cascade = CascadeType.ALL)
    private Etudiant etudiant;

    @Temporal(TemporalType.DATE)
    private Date date;

    private int nha;
}
