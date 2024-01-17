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
	private String photo_1;
	
	@Column(name = "Photo2")
	private String photo_2;
	
	@Column(name = "Photo3")
	private String photo_3;
	
	@Column(name = "Photo4")
	private String photo_4;
	
	@OneToOne(mappedBy = "photo")
    private Car car;
}
