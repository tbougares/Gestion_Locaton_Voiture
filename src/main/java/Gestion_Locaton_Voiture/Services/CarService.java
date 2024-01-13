package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import Gestion_Locaton_Voiture.Entity.Car;

public interface CarService {

	
	public List<Car> findAll();
	public Optional<Car> findByMatricuel (int matricuel);
	public Optional<Car> findById (Integer id);
	public void deleteById(int id);
	public void deleteAll();
	
}
