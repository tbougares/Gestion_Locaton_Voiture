package Gestion_Locaton_Voiture.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Dto.EntreteinDto;
import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Entretein;
import Gestion_Locaton_Voiture.Repository.CarRepository;
import Gestion_Locaton_Voiture.Repository.EntreteinRepository;
import Gestion_Locaton_Voiture.Services.EntreteinService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EntreteinServiceImpl implements EntreteinService {
	
	private final EntreteinRepository entreteinRepository;
	
	private final CarRepository carRepository;
	
	private  EntreteinDto entreteinDto;
	 
	@Override
	public List<Entretein> findAll() {
		// TODO Auto-generated method stub
		return entreteinRepository.findAll();
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
	public Entretein CreateOneEntretien(Integer IdCar ,EntreteinDto entretein) {
		// TODO Auto-generated method stub
		Car car= carRepository.findById(IdCar).orElseThrow();
		
		
		Entretein entreteins = entreteinDto.toEntity(entretein);
		car.getEntreteins().add(entreteins);
		entreteins.setVoiture(car);
		
		carRepository.save(car);
		return entreteinRepository.save(entreteins);
	}
	

	@Override
	public List<Entretein> getEntretiensByCarMatricule(String matricule) {
		// TODO Auto-generated method stub
		return entreteinRepository.findEntretiensByCarMatricule(matricule);
	}
	 public Entretein updateEntretien(Integer id, Entretein updatedEntretien) {
	        return entreteinRepository.findById(id)
	            .map(entretien -> {
	                entretien.setKiliometrageDeVidange(updatedEntretien.getKiliometrageDeVidange());
	                
	                return entreteinRepository.save(entretien);
	            })
	            .orElseThrow(() -> new EntityNotFoundException("Entretien non trouvé"));
	    }

}
