package Gestion_Locaton_Voiture.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cars")

public class Car extends AbstractClasse {
	
		
		@Column(name = "Name")
		private String name;

		@Column(name = "Brande")
		private String brande;
		
		@Column(name = "Matricule")
		private String matricule;
		
		@Column(name = "Mileage")
		private Double mileage;
		
		@Column(name = "Model")
		private int model;
		
		@Column(name = "HorsPower")
		private int horsPower;
		
		@Column(name = "Consumption")
		private Double consumption;

		@Enumerated(EnumType.STRING)
		@Column(name = "fuel")
		private Fuel fuel;
		
		@Column(name = "Bluetooth")
		private Boolean bluetooth;
		
		@Column(name = "AirBag")
		private Boolean airBag;

		@Enumerated(EnumType.STRING)
		@Column(name = "GearBox")
		private GearBox gearBox;
		
		@Column(name = "Seat")
		private int seat;
		
		@Column(name = "Door")
		private int door;

		
		@Column(name = "Style")
		private String style;
		
		@Column(name = "SizeCofer")
		private int size_Cofer;
		
		@Column(name = "Price")
		private Double price;
		
		@Column(name = "Rate")
		private Double rate;
		
		//-------------------Assurence------------------
		

		//-----------------------------------------------
		
    	@OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "photo_id", referencedColumnName = "id")
        private Photo photo;
		@JsonBackReference
		@OneToMany(mappedBy = "car")
	    private List<Reservation> orders;
}
