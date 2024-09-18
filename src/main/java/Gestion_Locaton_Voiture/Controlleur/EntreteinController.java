package Gestion_Locaton_Voiture.Controlleur;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Gestion_Locaton_Voiture.Dto.EntreteinDto;
import Gestion_Locaton_Voiture.Entity.Entretein;
import Gestion_Locaton_Voiture.Services.EntreteinService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Entreteins")


public class EntreteinController {

	
	
	private final EntreteinService entreteinService;
	
	public EntreteinController(EntreteinService entreteinService) {
		super();
		this.entreteinService = entreteinService;
	}
	@GetMapping("/All")

	public ResponseEntity<List<Entretein>> getAllClient()
	{
	return ResponseEntity.ok(entreteinService.findAll());	
	}
	@PostMapping("/{idCar}")

	public ResponseEntity<Entretein> addEntretein(@PathVariable (value="idCar") Integer id ,@RequestBody EntreteinDto entretein)
	{
	 
		return ResponseEntity.ok(entreteinService.CreateOneEntretien(id, entretein));	
	}
	
	@GetMapping("/getEntretiensByVoitureCode")
    public ResponseEntity<List<Entretein>> getEntretiensByVoitureCode(@RequestParam ("matricule") String matricule) {
        return ResponseEntity.ok(entreteinService.getEntretiensByCarMatricule(matricule));
    }
}
