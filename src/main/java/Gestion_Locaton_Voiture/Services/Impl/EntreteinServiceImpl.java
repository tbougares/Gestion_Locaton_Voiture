package Gestion_Locaton_Voiture.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.Entretein;
import Gestion_Locaton_Voiture.Repository.EntreteinRepository;
import Gestion_Locaton_Voiture.Services.EntreteinService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EntreteinServiceImpl implements EntreteinService {
	
	private final EntreteinRepository entreteinRepository;
	
	 
	@Override
	public List<Entretein> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Entretein> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Entretein> findEntreteinBy(String firstsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entretein update(Entretein entretien, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entretein CreateOneEntretien(Entretein entretein) {
		// TODO Auto-generated method stub
		return null;
	}

}
