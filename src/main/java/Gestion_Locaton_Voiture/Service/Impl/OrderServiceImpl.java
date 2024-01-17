package Gestion_Locaton_Voiture.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.Order;
import Gestion_Locaton_Voiture.Repository.OrderRepository;
import Gestion_Locaton_Voiture.Services.OrderService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	

	@Override
	public Optional<Order> findById(Integer id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(orderRepository.findById(id)==null) {
			return ;
		}
		orderRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		orderRepository.deleteAll();
	}



	@Override
	public Order CreateOneOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

}
