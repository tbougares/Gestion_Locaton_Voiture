package Gestion_Locaton_Voiture.Controlleur;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion_Locaton_Voiture.Dto.UserDto;
import Gestion_Locaton_Voiture.Services.UserService;
import lombok.RequiredArgsConstructor;




@RestController
@RequestMapping("/Users")
@RequiredArgsConstructor

public class UserControlleur {
	
	
	private final UserService userService;

	
	
	@GetMapping("/GetAllUser" )
	public ResponseEntity<List<UserDto>> getAllClient()
	{
	return ResponseEntity.ok(userService.findAll());	
	}
}
