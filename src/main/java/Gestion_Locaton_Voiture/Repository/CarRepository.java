package Gestion_Locaton_Voiture.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import Gestion_Locaton_Voiture.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	public Optional<Car> findByMatricule (String Matricule);
	public List<Car> findCarByBrande (String brande);
	Page<List<Car>> findByModel(String model, Pageable pagebale);
}
