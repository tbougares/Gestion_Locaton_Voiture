package Gestion_Locaton_Voiture.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Gestion_Locaton_Voiture.Entity.Client;



public interface ClientRepository extends JpaRepository<Client, Integer> {
	
	public Client  findByCIN(String CIN);
	@Query("SELECT c FROM Client c  WHERE c.firstName = ?1 ")
			List<Client> findByFirstName(String firstName);
	/*@Query(value = "SELECT * FROM Client u WHERE u.age = :startAge And u.age = :endAge ", 
			  nativeQuery = true)
			List<Client> findClientByFirst_NameNamedParamsNative(
			  @Param("startAge") Integer startAge , @Param("endAge") Integer endAge);
*/
	List<Client> findByAgeBetween(int startAge, int endAge);
}
