package Gestion_Locaton_Voiture.Controlleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Gestion_Locaton_Voiture.Services.CarService;
import lombok.RequiredArgsConstructor;




@Controller
@RequestMapping("/Cars")
@RequiredArgsConstructor
public class CarControlleur {

	
	
	private final CarService carService;

}
