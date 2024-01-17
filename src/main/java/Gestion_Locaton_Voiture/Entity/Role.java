package Gestion_Locaton_Voiture.Entity;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Role")
public class Role extends AbstractClasse {
	@Column(name = "Name")
	private String name;
	
	@OneToMany(mappedBy = "role")
    private List<User> user;
}
