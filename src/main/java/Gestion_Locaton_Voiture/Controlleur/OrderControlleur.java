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

import Gestion_Locaton_Voiture.Entity.Order;
import Gestion_Locaton_Voiture.Services.OrderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/Orders")
@RequiredArgsConstructor
public class OrderControlleur {

	private final OrderService orderService;

	
	@GetMapping
	@ApiOperation(value="GetAllOrder" )
	public ResponseEntity<List<Order>> getAllClient()
	{
	return ResponseEntity.ok(orderService.findAll());	
	}

	@GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> findById(
            @PathVariable("id") Integer orderId
    ) {
        return ResponseEntity.ok(orderService.findById(orderId));
    }
	

	@PostMapping
	public ResponseEntity<Order> addClient(@RequestBody @Valid Order order)
	{
		return ResponseEntity.ok(orderService.CreateOneOrder(order));

	}
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable Integer id)
	{
		orderService.deleteById(id);
		
	}
	@DeleteMapping
	public void deleteAll()
	{
		orderService.deleteAll();
		
	}

}
