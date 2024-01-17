package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import Gestion_Locaton_Voiture.Entity.Order;

public interface OrderService {
	
	
	public List<Order> findAll();
	public Optional<Order> findById (Integer id);
	public void deleteById(Integer id);
	public void deleteAll();
	public Order CreateOneOrder (Order order);

}
