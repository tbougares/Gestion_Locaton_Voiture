package Gestion_Locaton_Voiture.Services;

import java.util.List;
import java.util.Optional;

import Gestion_Locaton_Voiture.Entity.Role;

public interface RoleService {
	public List<Role> findAll();
	public Optional<Role> findById (Integer id);
	public void deleteById(int id);
	public void deleteAll();
}
