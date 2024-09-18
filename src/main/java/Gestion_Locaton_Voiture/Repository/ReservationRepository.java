package Gestion_Locaton_Voiture.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Gestion_Locaton_Voiture.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	// Récupérer les réservations entre deux dates pour une voiture spécifique
    @Query("SELECT r FROM Reservation r WHERE r.car.id = :carId AND r.startDate <= :dateFin AND r.endDate >= :dateDebut ORDER BY r.startDate ASC")
    List<Reservation> findReservationsByVoitureAndDates(
    		@Param("carId") Integer voitureId,
        @Param("dateDebut") LocalDate dateDebut,
        @Param("dateFin") LocalDate dateFin);


}
