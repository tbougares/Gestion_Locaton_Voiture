package Gestion_Locaton_Voiture.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Gestion_Locaton_Voiture.Entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
