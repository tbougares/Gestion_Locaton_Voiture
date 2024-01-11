package Gestion_Locaton_Voiture.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Address")
@Embeddable
public class Addresse  {
	 @Column(name = "adresse1")
	  private String adresse1;

	  @Column(name = "adresse2")
	  private String adresse2;

	  @Column(name = "ville")
	  private String ville;

	  @Column(name = "codepostale")
	  private String codePostale;

	  @Column(name = "pays")
	  private String pays;

}
