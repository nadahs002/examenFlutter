package org.isetn.repository;

import java.util.List;


import org.isetn.entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface MatiereRepository extends JpaRepository<Matiere, Long> {
	/*@Query("select p from Matiere e where e.nom like :x")
	public List<Matiere> Chercher(@Param("x")String nomMatiere);*/
    public List<Matiere> findByNomMatiereContains(String nomMatiere);

}

