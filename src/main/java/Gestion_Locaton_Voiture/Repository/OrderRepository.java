package Gestion_Locaton_Voiture.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Gestion_Locaton_Voiture.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
