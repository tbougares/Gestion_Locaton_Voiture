package Gestion_Locaton_Voiture.Services.Impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import Gestion_Locaton_Voiture.Dto.ReservationDto;
import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Client;
import Gestion_Locaton_Voiture.Entity.Entretein;
import Gestion_Locaton_Voiture.Entity.Reservation;
import Gestion_Locaton_Voiture.Entity.User;
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
	
	private final ReservationDto reservationDto;
	

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
	public void assigneResevationToCarAndToClient( String Matricule ,String Cin , ReservationDto reservationDto) {
		// TODO Auto-generated method stub
		Car car = carRepository.findByMatricule(Matricule).orElseThrow (() -> new EntityNotFoundException( "Aucun Voiture avec le Matricule = " + Matricule + " n' ete trouve "));
		Client client = clientRepository.findByCIN(Cin).orElseThrow (() -> new EntityNotFoundException( "Aucun Client avec le code = " + Cin + " n' ete trouve "));
		
		Reservation reservation = reservationDto.toEntity(reservationDto);
	}

	 public boolean isVoitureAvailable(Integer Matricule, LocalDate dateDebut, LocalDate dateFin) {
	        List<Reservation> reservations = ReservationRepository.findReservationsByVoitureAndDates(Matricule ,dateDebut, dateFin);
	        return reservations.isEmpty(); // Si aucune réservation n'est trouvée, la voiture est disponible
	    }
	 @Override
	    // Créer une réservation si la voiture est disponible
	    public Reservation createReservationIfAvailable(Integer Matricule,String Cin, LocalDate dateDebut, LocalDate dateFin , ReservationDto reservationdto) {
		 Car car = carRepository.findById(Matricule).orElseThrow (() -> new EntityNotFoundException( "Aucun Voiture avec le Matricule = " + Matricule + " n' ete trouve "));
			Client client = clientRepository.findByCIN(Cin).orElseThrow (() -> new EntityNotFoundException( "Aucun Client avec le CIN = " + Cin + " n' ete trouve "));
			  
		 // Vérifier la disponibilité
	        if (isVoitureAvailable(Matricule, dateDebut, dateFin)) {
	        	
	        	Reservation reservation = reservationDto.toEntity(reservationdto);
	            
	            
	            reservation.setCar(car);  // Vous devez charger la voiture dans un environnement réel
	            reservation.setUser(client);;      // Vous devez charger le client dans un environnement réel
	            reservation.setStartDate(dateDebut);
	            reservation.setEndDate(dateFin);

	            return ReservationRepository.save(reservation);  // Enregistrer la réservation
	        } else {
	            throw new RuntimeException("La voiture n'est pas disponible pour les dates demandées.");
	        }
	    }


	@Override
	public List<String> getSuggestionsVoituresDisponibles(LocalDate dateDebut, LocalDate dateFin, int flexibilite) {
		// TODO Auto-generated method stub
		return null;
	}



}
