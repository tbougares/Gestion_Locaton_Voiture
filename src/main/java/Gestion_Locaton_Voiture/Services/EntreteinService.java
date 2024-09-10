package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import Gestion_Locaton_Voiture.Entity.Entretein;

public interface EntreteinService {
	
	public List<Entretein> findAll();
	public Optional<Entretein> findById (Integer id);
	public void deleteById(Integer id);
	
	public List<Entretein> findEntreteinBy(String firstsName);
	
	public Entretein update(Entretein entretien ,Integer id);
	public Entretein CreateOneEntretien (Entretein entretein);
	public List<Entretein> getEntretiensByCarMatricule(String matricule);
}
