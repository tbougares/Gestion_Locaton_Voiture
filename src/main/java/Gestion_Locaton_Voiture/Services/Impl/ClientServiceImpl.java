package Gestion_Locaton_Voiture.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.Client;
import Gestion_Locaton_Voiture.Repository.ClientRepository;
import Gestion_Locaton_Voiture.Services.ClientService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

	
	private final ClientRepository clientRepository;
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Optional<Client> findById(Integer id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		clientRepository.deleteAll();
	}

	@Override
	public Client findByCIN(String CIN) {
		// TODO Auto-generated method stub
		return clientRepository.findByCIN(CIN);
	}

	@Override
	public List<Client> findClientByFirst_NameNamedParamsNative(String first_Name) {
		// TODO Auto-generated method stub
		return clientRepository.findClientByFirst_NameNamedParamsNative(first_Name);
	}

	@Override
	public List<Client> findByStartAgeBetween(int startAge, int endAge) {
		// TODO Auto-generated method stub
		return clientRepository.findByAgeBetween(startAge, endAge);
	}

	@Override
	public Client update(Client client, Integer id) {
		// TODO Auto-generated method stub
		Client existingClient = clientRepository.findById(id)
				.orElseThrow();
		
		if (client.getAdress() != null) existingClient.setAdress(client.getAdress());
		if (client.getAge() != 0) existingClient.setAge(client.getAge());
		if (client.getCountry() != null) existingClient.setCountry(client.getCountry());
		if (client.getCIN() != null) existingClient.setCIN(client.getCIN());
		if (client.getCity() != null) existingClient.setCity(client.getCity());
		if (client.getDate_Creation() != null) existingClient.setDate_Creation(client.getDate_Creation());
		if (client.getEmail() != null) existingClient.setEmail(client.getEmail());
		if (client.getFirst_Name() != null) existingClient.setFirst_Name(client.getFirst_Name());
		if (client.getGender() != null) existingClient.setGender(client.getGender());
		if (client.getLast_CheckIn() != null) existingClient.setLast_CheckIn(client.getLast_CheckIn());
		if (client.getLast_Name() != null) existingClient.setLast_Name(client.getLast_Name());
		if (client.getPassword() != null) existingClient.setPassword(client.getPassword());
		if (client.getTel() != null) existingClient.setTel(client.getTel());
		if (client.getUsername() != null) existingClient.setUserName(client.getUsername());
		
		clientRepository.save(existingClient);

		return existingClient;
	}

	@Override
	public Client CreateOneClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

}
