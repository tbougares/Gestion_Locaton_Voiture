package Gestion_Locaton_Voiture.Controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


public class CarControlleur {

	
	
	private final CarService carService;
	
	public CarControlleur(CarService carService) {
		super();
		this.carService = carService;
	}

	@GetMapping
	
	public ResponseEntity<List<Car>> getAllCars()
	{
	return ResponseEntity.ok(carService.findAll());
//		return ResponseEntity.ok("test");
	}

	@GetMapping("/matricuel/{Car-Matricuel}")
	public ResponseEntity<Optional<Car>> getAllCarByMatricuel(
			@RequestParam("Car-Matricuel") String carMat)
	{
	return ResponseEntity.ok(carService.findByMatricuel(carMat));	
	}
	
	
	@GetMapping("/Car-Brand/{Car-Brand}")
	public ResponseEntity<List<Car>> getAllCarsByBrand(
			@RequestParam("Car-Brand") String carBrande)
	{
	return ResponseEntity.ok(carService.findCarByBrande(carBrande));	
	}
	
	
	@GetMapping("/Car-model/{model}")
	public ResponseEntity<Page<List<Car>>> getAllCarsByModel(@RequestParam("model") int model,
			@RequestParam("page") int page, 
			  @RequestParam("size") int size)
	{
	return ResponseEntity.ok(carService.findByModel(model, page, size));	
	}
	
	
	@GetMapping("/id/{id}")
    public ResponseEntity<Optional<Car>> findById(
            @PathVariable("id") Integer carId
    ) {
        return ResponseEntity.ok(carService.findById(carId));
    }
	

	@PostMapping
	public ResponseEntity<Car> addCar(@RequestBody @Valid Car car)
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
