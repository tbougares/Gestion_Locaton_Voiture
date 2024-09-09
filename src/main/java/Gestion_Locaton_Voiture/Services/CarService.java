package Gestion_Locaton_Voiture.Services;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Reservation;

public interface CarService {

	
	public List<Car> findAll();
	public Optional<Car> findByMatricuel (String matricuel);
	public Optional<Car> findById (Integer id);
	public void deleteById(Integer id);
	public void deleteAll();
	public Page<List<Car>> findByModel(int model, int NombrePage,int SizePage);
	public List<Car> findCarByBrande (String brande); 
	public Car CreateOneCar(Car car);
	public List<Car> getVoituresDisponibles(LocalDate dateDebut, LocalDate dateFin);
    public List<String> getSuggestionsVoituresDisponibles(LocalDate dateDebut, LocalDate dateFin, int flexibilite);
	
}