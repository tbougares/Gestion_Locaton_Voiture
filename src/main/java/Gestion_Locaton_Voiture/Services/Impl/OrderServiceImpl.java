package Gestion_Locaton_Voiture.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.Reservation;
import Gestion_Locaton_Voiture.Repository.CarRepository;
import Gestion_Locaton_Voiture.Repository.ClientRepository;
import Gestion_Locaton_Voiture.Repository.OrderRepository;
import Gestion_Locaton_Voiture.Services.OrderService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;
	
	private final CarRepository carRepository;

	private final ClientRepository clientRepository;
	

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	

	@Override
	public Optional<Reservation> findById(Integer id) {
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
	public void assigneResevationToCarAndToClient(Integer id, Integer idCar, Integer idClient) {
		// TODO Auto-generated method stub
		
	}

}
