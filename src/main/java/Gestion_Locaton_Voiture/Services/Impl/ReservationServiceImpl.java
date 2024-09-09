package Gestion_Locaton_Voiture.Services.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Reservation;
import Gestion_Locaton_Voiture.Repository.CarRepository;
import Gestion_Locaton_Voiture.Repository.ClientRepository;
import Gestion_Locaton_Voiture.Repository.ReservationRepository;
import Gestion_Locaton_Voiture.Services.ReservationService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

	private final ReservationRepository ReservationRepository;
	
	private final CarRepository carRepository;

	private final ClientRepository clientRepository;
	

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return ReservationRepository.findAll();
	}

	

	@Override
	public Optional<Reservation> findById(Integer id) {
		// TODO Auto-generated method stub
		return ReservationRepository.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(ReservationRepository.findById(id)==null) {
			return ;
		}
		ReservationRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		ReservationRepository.deleteAll();
	}





	@Override
	public void assigneResevationToCarAndToClient( Integer idCar, Integer idClient) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<String> getSuggestionsVoituresDisponibles(LocalDate dateDebut, LocalDate dateFin, int flexibilite) {
		// TODO Auto-generated method stub
		return null;
	}



}
