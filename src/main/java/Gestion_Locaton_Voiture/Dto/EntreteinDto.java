package Gestion_Locaton_Voiture.Dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Entretein;
import Gestion_Locaton_Voiture.Entity.Gender;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntreteinDto {

	@NotBlank
	@NotEmpty
	private Integer id;
	@NotBlank
	@NotEmpty
	private Double KiliometrageDeVidange;
	@NotBlank
	@NotEmpty
	private LocalDateTime dateDeVidange;

	private Double NextKiliometrageDeVidange;	
	private LocalDateTime dateDebut;
    private String Diagnostic;
   
    private CarDto voiture;


    public static EntreteinDto fromEntity(Entretein entretein) {
	    if (entretein == null) {
	      return null;
	    }
	    return EntreteinDto.builder()
	        .id(entretein.getId())
	        .KiliometrageDeVidange(entretein.getKiliometrageDeVidange())
	        .dateDeVidange(entretein.getDateDeVidange())
	        .NextKiliometrageDeVidange(entretein.getNextKiliometrageDeVidange())
	        .dateDebut(entretein.getDateDebut())
	        .Diagnostic(entretein.getDiagnostic())
	        .voiture(CarDto.fromEntity(entretein.getVoiture()))
	        .build();
	  }

	  public static Entretein toEntity(EntreteinDto dto) {
	    if (dto == null) {
	      return null;
	    }
	    Entretein entretein = new Entretein();
	    entretein.setId(dto.getId());
	    entretein.setDateDebut(dto.getDateDebut());
	    entretein.setDateDeVidange(dto.getDateDeVidange());
	    entretein.setDiagnostic(dto.getDiagnostic());
	    entretein.setKiliometrageDeVidange(dto.getKiliometrageDeVidange());
	    entretein.setNextKiliometrageDeVidange(dto.getNextKiliometrageDeVidange());

	    return entretein;
	  }


}
