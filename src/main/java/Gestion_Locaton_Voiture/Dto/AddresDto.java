package Gestion_Locaton_Voiture.Dto;

import Gestion_Locaton_Voiture.Entity.Addresse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AddresDto {
	@NotBlank
	@NotEmpty
	  private String adresse1;

	@NotBlank
	@NotEmpty
	  private String adresse2;

	@NotBlank
	@NotEmpty
	  private String ville;

	@NotBlank
	@NotEmpty
	  private String codePostale;
	@NotBlank
	@NotEmpty
	  private String pays;

	  public static AddresDto fromEntity(Addresse adresse) {
		    if (adresse == null) {
		      return null;
		    }

		    return AddresDto.builder()
		        .adresse1(adresse.getAdresse1())
		        .adresse2(adresse.getAdresse2())
		        .codePostale(adresse.getCodePostale())
		        .ville(adresse.getVille())
		        .pays(adresse.getPays())
		        .build();
		  }

		  public static Addresse toEntity(AddresDto adresseDto) {
		    if (adresseDto == null) {
		      return null;
		    }
		    Addresse adresse = new Addresse();
		    adresse.setAdresse1(adresseDto.getAdresse1());
		    adresse.setAdresse2(adresseDto.getAdresse2());
		    adresse.setCodePostale(adresseDto.getCodePostale());
		    adresse.setVille(adresseDto.getVille());
		    adresse.setPays(adresseDto.getPays());
		    return adresse;
		  }

}
