package Gestion_Locaton_Voiture.Entity;
import java.time.LocalDate;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String last_Name;

	@Enumerated(EnumType.STRING)
	@Column(name = "Gender")
	private Gender gender;

	@Column(name = "Age")
	private int age;
	
	
	@Embedded
	@Column(name = "Adress")
	private Addresse adress;
	
	@Column(name = "Tel")
	private String tel;

	@Column(name = "City")
	private String city;
	
	@Column(name = "Country")
	private String country;
	
	@Column(name = "CIN")
	private String CIN;
	
	
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "DateCreation")
	private LocalDate date_Creation;
	
	@Column(name = "email")
	private String email;
	
}
