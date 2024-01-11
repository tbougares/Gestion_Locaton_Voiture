package Gestion_Locaton_Voiture.Entity;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Client")

public class Client extends User {

	@Column(name = "FirstName")
	private String First_Name;
	
	@Column(name = "LastName")
	private String Last_Name;

	@Enumerated(EnumType.STRING)
	@Column(name = "Gender")
	private Gender gender;

	@Column(name = "Age")
	private int Age;
	
	@Embedded
	@Column(name = "Adress")
	private Addresse Adress;
	
	@Column(name = "Tel")
	private String Tel;

	@Column(name = "City")
	private String City;
	
	@Column(name = "Country")
	private String Country;
	
	@Column(name = "CIN")
	private String CIN;
	
	
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "DateCreation")
	private Date Date_Creation;
	
	@Column(name = "Email")
	private String Email;
	
}
