package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import Gestion_Locaton_Voiture.Entity.Reservation;

public interface OrderService {
	
	
	public List<Reservation> findAll();
	public Optional<Reservation> findById (Integer id);
	public void deleteById(Integer id);
	public void deleteAll();
	public void assigneResevationToCarAndToClient(Integer id,Integer idCar,Integer idClient);

}
