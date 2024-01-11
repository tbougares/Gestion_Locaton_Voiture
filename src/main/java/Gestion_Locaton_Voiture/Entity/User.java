package Gestion_Locaton_Voiture.Entity;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.InheritanceType;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="User")

public class User extends AbstractClasse {
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "LastCheckIn")
	private Date Last_CheckIn;
	
	@Column(name = "UserName")
	private String UserName;
	
	@Column(name = "PassWord")
	private String PassWord;
	
	@ManyToOne
    @JoinColumn(name="role_id", nullable=false)
    private Role role;
	
	@OneToMany(mappedBy = "user")
    private List<Order> orders;
}
