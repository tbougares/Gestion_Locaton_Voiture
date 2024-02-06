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

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Services.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;




@RestController
@RequestMapping("/Cars")
@RequiredArgsConstructor
@Api()
public class CarControlleur {

	
	
	private final CarService carService;
	
	@GetMapping
	@ApiOperation(value="GetAllCar" )
	public ResponseEntity<List<Car>> getAllClient()
	{
	return ResponseEntity.ok(carService.findAll());	
	}

	@GetMapping("/{id}")
    public ResponseEntity<Optional<Car>> findById(
            @PathVariable("id") Integer carId
    ) {
        return ResponseEntity.ok(carService.findById(carId));
    }
	

	@PostMapping
	public ResponseEntity<Car> addClient(@RequestBody @Valid Car car)
	{
		return ResponseEntity.ok(carService.CreateOneCar(car));

	}
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable Integer id)
	{
		carService.deleteById(id);
		
	}
	@DeleteMapping
	public void deleteAll()
	{
		carService.deleteAll();
		
	}

}
