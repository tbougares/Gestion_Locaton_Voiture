package Gestion_Locaton_Voiture.Entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Entretein")

public class Entretein extends AbstractClasse {

		private Double KiliometrageDeVidange;
		private LocalDateTime dateDeVidange;

		private Double NextKiliometrageDeVidange;	
		private LocalDateTime dateDebut;
	    private String Diagnostic;
	    
	    @JsonManagedReference
	    @ManyToOne
	    @JoinColumn(name = "voiture_id", nullable = false)
	    private Car voiture;

	    // Constructeurs, Getters et Setters
	    
}
