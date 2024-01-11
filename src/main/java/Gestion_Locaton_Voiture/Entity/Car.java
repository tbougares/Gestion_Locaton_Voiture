package Gestion_Locaton_Voiture.Entity;

import java.util.List;

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
		private String Name;

		@Column(name = "Brande")
		private String brande;
		
		@Column(name = "Matricule")
		private String Matricule;
		
		@Column(name = "Mileage")
		private Double Mileage;
		
		@Column(name = "Model")
		private int Model;
		
		@Column(name = "HorsPower")
		private int HorsPower;
		
		@Column(name = "Consumption")
		private Double Consumption;

		@Enumerated(EnumType.STRING)
		@Column(name = "fuel")
		private Fuel fuel;
		
		@Column(name = "Bluetooth")
		private Boolean Bluetooth;
		
		@Column(name = "AirBag")
		private Boolean AirBag;

		@Enumerated(EnumType.STRING)
		@Column(name = "GearBox")
		private GearBox gearBox;
		
		@Column(name = "Seat")
		private int Seat;
		
		@Column(name = "Door")
		private int Door;

		
		@Column(name = "Style")
		private String style;
		
		@Column(name = "SizeCofer")
		private int Size_Cofer;
		
		@Column(name = "Price")
		private Double Price;
		
		@Column(name = "Rate")
		private Double Rate;
		
		//-------------------Assurence-------------------
		
		@Column(name = "CDM")
		private Boolean CDM;
		
		@Column(name = "ProtectionVol")
		private Boolean Protection_Vol;
		
		@Column(name = "RespoCivile")
		private Boolean Respo_Civile;

		@Column(name = "BrisGlacePneus")
		private Boolean Bris_Glace_Pneus;
		
		//-----------------------------------------------
		
		@OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "photo_id", referencedColumnName = "id")
	    private Photo photo;
		
		@OneToMany(mappedBy = "car")
	    private List<Order> orders;
}
