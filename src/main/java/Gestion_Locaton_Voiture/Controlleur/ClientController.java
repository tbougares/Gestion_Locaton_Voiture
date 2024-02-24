package Gestion_Locaton_Voiture.Controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Gestion_Locaton_Voiture.Entity.Client;
import Gestion_Locaton_Voiture.Services.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/Clients")
@RequiredArgsConstructor
@Api("/Clients")
public class ClientController {
	
	
	private final ClientService clientService;

	
	
	@GetMapping
	@ApiOperation(value="GetAllClient" )
	public ResponseEntity<List<Client>> getAllClient()
	{
	return ResponseEntity.ok(clientService.findAll());	
	}
	
	
	@GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> findById(
    		@RequestParam("id") Integer clientId
    ) {
        return ResponseEntity.ok(clientService.findById(clientId));
    }
	
	
	@GetMapping("/{CIN}")
    public ResponseEntity<Client> findByCIN(
            @RequestParam("CIN") String clientCIN
    ) {
        return ResponseEntity.ok(clientService.findByCIN(clientCIN));
    }
	
	@GetMapping("/{FirstName}")
	public ResponseEntity<List<Client>> getAllClientByFirstName(
			@RequestParam("FirstName") String clientFirstName)
	{
	return ResponseEntity.ok(clientService.findClientByFirst_NameNamedParamsNative(clientFirstName));	
	}

	@GetMapping("/findByAgeBetween")
	public ResponseEntity<List<Client>> getAllClientByAge(
			@RequestParam("startAge") int clientStartAge,
			@RequestParam("startAge") int clientEndAge)
	{
	return ResponseEntity.ok(clientService.findByAgeBetween(clientStartAge, clientEndAge));	
	}
	@PostMapping
	public ResponseEntity<Client> addClient(@RequestBody @Valid Client client)
	{
		return ResponseEntity.ok(clientService.CreateOneClient(client));

	}
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable Integer id)
	{
		clientService.deleteById(id);
		
	}
	@DeleteMapping
	public void deleteAll()
	{
		clientService.deleteAll();
		
	}
}
