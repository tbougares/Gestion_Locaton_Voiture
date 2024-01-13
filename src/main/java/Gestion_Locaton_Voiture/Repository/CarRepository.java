package Gestion_Locaton_Voiture.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Client;

public interface CarRepository extends JpaRepository<Client, Integer> {

	public Optional<Car> findByMatricuel (Integer matricuel);
}
