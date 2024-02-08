package Gestion_Locaton_Voiture.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Gestion_Locaton_Voiture.Entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByEmail(String email);

}
