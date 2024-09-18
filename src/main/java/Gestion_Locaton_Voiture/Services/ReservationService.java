package Gestion_Locaton_Voiture.Services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import Gestion_Locaton_Voiture.Dto.ReservationDto;
import Gestion_Locaton_Voiture.Entity.Reservation;

public interface ReservationService {
	
	
	public List<Reservation> findAll();
	public Optional<Reservation> findById (Integer id);
	public void deleteById(Integer id);
	public void deleteAll();
	public void assigneResevationToCarAndToClient(String Matricule ,String Cin , ReservationDto reservation);
    public List<String> getSuggestionsVoituresDisponibles(LocalDate dateDebut, LocalDate dateFin, int flexibilite);
    public Reservation createReservationIfAvailable(Integer voitureId, String Cin, LocalDate dateDebut, LocalDate dateFin , ReservationDto reservationdto) ;


}
