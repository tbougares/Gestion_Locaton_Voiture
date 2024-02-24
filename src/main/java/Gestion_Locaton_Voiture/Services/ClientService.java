package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Gestion_Locaton_Voiture.Entity.Client;

public interface ClientService {
	public List<Client> findAll();
	public Optional<Client> findById (Integer id);
	public void deleteById(Integer id);
	public void deleteAll();
	public Client  findByCIN(String CIN);
	
	public List<Client> findClientByFirst_NameNamedParamsNative(String first_Name);
	
	public List<Client> findByAgeBetween(int startAge, int endAge);
	public Client update(Client client ,Integer id);
	public Client CreateOneClient (Client client);
}
