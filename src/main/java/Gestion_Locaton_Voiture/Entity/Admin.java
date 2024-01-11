package Gestion_Locaton_Voiture.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Admin")

public class Admin extends  User {

	
	
	@Column(name = "FullName")
	private String Full_Name;

}
