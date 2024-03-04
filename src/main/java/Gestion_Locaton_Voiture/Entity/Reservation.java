package Gestion_Locaton_Voiture.Entity;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resérvation")
public class Reservation  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "country")
	private String country;

	@Column(name = "BookingCity")
	private String bookingCity;

	@Column(name = "ReturnCity")
	private String returnCity;
	
	@Column(name = "StartDate")
	private Date startDate;
	
	@Column(name = "EndDate")
	private Date endDate;
	
	@Column(name = "ClientAge")
	private Integer clientAge;
	
	
	
	@Column(name = "OrderStatus")
	private String orderStatus;
    @JsonManagedReference
	@ManyToOne
    @JoinColumn(name="car_id")
    private Car car;
	@JsonManagedReference
	@ManyToOne
    @JoinColumn(name="user_id")
    private User user;
	

}
