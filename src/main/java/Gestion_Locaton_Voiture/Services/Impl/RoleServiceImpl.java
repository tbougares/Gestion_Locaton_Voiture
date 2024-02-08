package Gestion_Locaton_Voiture.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.Role;
import Gestion_Locaton_Voiture.Repository.RoleRepository;
import Gestion_Locaton_Voiture.Services.RoleService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

	private final RoleRepository roleRepository;

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Optional<Role> findById(Integer id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id);
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		if (id == null) {
			return;
		}
		roleRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		roleRepository.deleteAll();
	}

	@Override
	public Role CreateOneRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

}
