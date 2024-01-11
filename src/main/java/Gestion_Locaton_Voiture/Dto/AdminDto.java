package Gestion_Locaton_Voiture.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {
	
	private Integer id;
	private String Full_Name;

}
