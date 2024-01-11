package Gestion_Locaton_Voiture.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Photo")
public class Photo extends AbstractClasse {

	@Column(name = "Photo1")
	private String Photo_1;
	
	@Column(name = "Photo2")
	private String Photo_2;
	
	@Column(name = "Photo3")
	private String Photo_3;
	
	@Column(name = "Photo4")
	private String Photo_4;
	
	@OneToOne(mappedBy = "photo")
    private Car car;
}
