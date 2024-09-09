package Gestion_Locaton_Voiture.Controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion_Locaton_Voiture.Entity.Reservation;
import Gestion_Locaton_Voiture.Services.CarService;
import Gestion_Locaton_Voiture.Services.ClientService;
import Gestion_Locaton_Voiture.Services.ReservationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/Reservation")
@RequiredArgsConstructor
public class ReservationControlleur {

	private final ReservationService reservationService;
	private final ClientService clientService;
	private final CarService carService;
	
	@GetMapping("/GetAllOrder" )
	public ResponseEntity<List<Reservation>> getAllReservation()
	{
	return ResponseEntity.ok(reservationService.findAll());	
	}

	@GetMapping("/{id}")
    public ResponseEntity<Optional<Reservation>> findById(
            @PathVariable("id") Integer orderId
    ) {
        return ResponseEntity.ok(reservationService.findById(orderId));
    }
	

	
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable Integer id)
	{
		reservationService.deleteById(id);
		
	}
	@DeleteMapping
	public void deleteAll()
	{
		reservationService.deleteAll();
		
	}

}
