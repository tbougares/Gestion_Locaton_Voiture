package Gestion_Locaton_Voiture.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Gestion_Locaton_Voiture.Dto.EntreteinDto;
import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Entretein;

public interface EntreteinRepository extends JpaRepository<Entretein, Integer> {


	@Query("SELECT e FROM Entretein e WHERE e.voiture.matricule = :matricule")
    List<Entretein> findEntretiensByCarMatricule(@Param("matricule") String matricule);
	
	
}

