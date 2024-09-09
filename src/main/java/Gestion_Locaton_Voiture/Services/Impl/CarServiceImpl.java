package Gestion_Locaton_Voiture.Services.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Reservation;
import Gestion_Locaton_Voiture.Repository.CarRepository;
import Gestion_Locaton_Voiture.Repository.ReservationRepository;
import Gestion_Locaton_Voiture.Services.CarService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

	
	private final CarRepository carRepository;
	
	private final ReservationRepository ReservationRepository;

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}

	

	@Override
	public Optional<Car> findById(Integer id) {
		// TODO Auto-generated method stub
		return carRepository.findById(id);
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		carRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		if (id == null) {
			return;
		}
		carRepository.deleteById(id);
	}

	@Override
	public Optional<Car> findByMatricuel(String matricuel) {
		// TODO Auto-generated method stub
		return carRepository.findByMatricule(matricuel);
	}

	

	@Override
	public List<Car> findCarByBrande(String brande) {
		// TODO Auto-generated method stub
		return carRepository.findCarByBrande(brande);
	}



	@Override
	public Car CreateOneCar(Car car) {
		// TODO Auto-generated method stub
		return carRepository.save(car);
	}



	@Override
	public Page<List<Car>> findByModel(int model, int NombrePage, int SizePage) {
		// TODO Auto-generated method stub
		return  carRepository.findByModel(model, PageRequest.of(NombrePage, SizePage));

	}



	



	@Override
	public List<Car> getVoituresDisponibles(LocalDate dateDebut, LocalDate dateFin) {
		// TODO Auto-generated method stub
		return carRepository.findCarsDisponiblesEntreDates(dateDebut, dateFin);
		 	
	}




@Override
public List<String> getSuggestionsVoituresDisponibles(LocalDate dateDebut, LocalDate dateFin, int flexibilite) {
	// TODO Auto-generated method stub
	List<Car> voitures = carRepository.findAll();
    List<String> suggestions = new ArrayList<>();

    LocalDate dateDebutFlex = dateDebut.minusDays(flexibilite);
    LocalDate dateFinFlex = dateFin.plusDays(flexibilite);

    for (Car voiture : voitures) {
        List<Reservation> reservations = ReservationRepository.findReservationsByVoitureAndDates(voiture.getId(), dateDebutFlex, dateFinFlex);
        
        if (reservations.isEmpty()) {
            suggestions.add("Voiture " + voiture.getBrande() + " " + voiture.getModel() + " est disponible entre " + dateDebut + " et " + dateFin + " avec flexibilité de ±" + flexibilite + " jours.");
        } else {
            for (int i = 0; i <= flexibilite; i++) {
                LocalDate newStart = dateDebut.minusDays(i);
                LocalDate newEnd = dateFin.plusDays(i);
                if (ReservationRepository.findReservationsByVoitureAndDates(voiture.getId(), newStart, newEnd).isEmpty()) {
                    suggestions.add("Voiture " + voiture.getBrande() + " " + voiture.getModel() + " est disponible du " + newStart + " au " + newEnd + ".");
                    break;
                }
            }
        }
}
    return suggestions;
}
}



	


