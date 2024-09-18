package Gestion_Locaton_Voiture.Services.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Dto.ClientDto;
import Gestion_Locaton_Voiture.Entity.Client;
import Gestion_Locaton_Voiture.Repository.ClientRepository;
import Gestion_Locaton_Voiture.Services.ClientService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

	
	private final ClientRepository clientRepository;
	@Override
	public List<ClientDto> findAll() {
		// TODO Auto-generated method stub
		return clientRepository.findAll().stream()
		        .map(ClientDto::fromEntity)
		        .collect(Collectors.toList());
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
	public Optional<Client> findByCIN(String CIN) {
		// TODO Auto-generated method stub
		return clientRepository.findByCIN(CIN);
	}

	@Override
	public List<Client> findClientByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return clientRepository.findByFirstName(firstName);
	}

	@Override
	public List<Client> findByAgeBetween(int startAge, int endAge) {
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
		if (client.getFirstName() != null) existingClient.setFirstName(client.getFirstName());
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
