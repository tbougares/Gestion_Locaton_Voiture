package Gestion_Locaton_Voiture.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Gestion_Locaton_Voiture.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	public Optional<Car> findByMatricule (String Matricule);
	public List<Car> findCarByBrande (String brande);
	Page<List<Car>> findByModel(int model, Pageable pagebale);
	@Query("SELECT v FROM Car v WHERE v.id NOT IN (SELECT r.car.id FROM Reservation r WHERE r.endDate >= :dateDebut AND r.startDate <= :dateFin)")
	List<Car> findCarsDisponiblesEntreDates(@Param("dateDebut") LocalDate dateDebut, @Param("dateFin") LocalDate dateFin);

}
