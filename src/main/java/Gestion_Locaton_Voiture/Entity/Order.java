package Gestion_Locaton_Voiture.Entity;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Order")
public class Order extends AbstractClasse {
	@Column(name = "country")
	private String country;

	@Column(name = "BookingCity")
	private String booking_City;

	@Column(name = "ReturnCity")
	private String return_City;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "StartDate")
	private Date start_Date;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "EndDate")
	private Date end_Date;
	
	@Column(name = "ClientAge")
	private int client_Age;
	
	
	
	@Column(name = "OrderStatus")
	private String Order_Status;
	
	@ManyToOne
    @JoinColumn(name="car_id", nullable=false)
    private Car car;
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
	

}
