package Gestion_Locaton_Voiture.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Gestion_Locaton_Voiture.Entity.Photo;

public interface PhotorRepository extends JpaRepository<Photo, Integer> {

}
