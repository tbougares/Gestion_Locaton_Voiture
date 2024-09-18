package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Gestion_Locaton_Voiture.Dto.ClientDto;
import Gestion_Locaton_Voiture.Entity.Client;

public interface ClientService {
	public List<ClientDto> findAll();
	public Optional<Client> findById (Integer id);
	public void deleteById(Integer id);
	public void deleteAll();
	public Optional<Client>  findByCIN(String CIN);
	
	public List<Client> findClientByFirstName(String firstsName);
	
	public List<Client> findByAgeBetween(int startAge, int endAge);
	public Client update(Client client ,Integer id);
	public Client CreateOneClient (Client client);
}
