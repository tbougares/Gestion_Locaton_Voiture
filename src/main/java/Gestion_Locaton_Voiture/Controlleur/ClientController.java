package Gestion_Locaton_Voiture.Controlleur;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Gestion_Locaton_Voiture.Entity.Client;
import Gestion_Locaton_Voiture.Services.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/Clients")
@Api("/Clients")
public class ClientController {
	
	
	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		
		this.clientService = clientService;
	}
	
	@GetMapping
	@ApiOperation(value="GetAll Client" )
	public ResponseEntity<List<Client>> getAllClient()
	{
	return ResponseEntity.ok(clientService.findAll());	
	}
	
	

}
