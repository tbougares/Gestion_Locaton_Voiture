package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import Gestion_Locaton_Voiture.Entity.Admin;

public interface AdminService {
	public List<Admin> findAll();
	public Optional<Admin> findByMatricuel (int matricuel);
	public Optional<Admin> findById (Integer id);
	public void deleteById(int id);
	public void deleteAll();

}
