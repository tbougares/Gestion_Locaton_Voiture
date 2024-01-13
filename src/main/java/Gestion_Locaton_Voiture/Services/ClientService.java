package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import Gestion_Locaton_Voiture.Entity.Client;

public interface ClientService {
	public List<Client> findAll();
	public Optional<Client> findById (Integer id);
	public void deleteById(int id);
	public void deleteAll();
}
