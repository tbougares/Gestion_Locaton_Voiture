package Gestion_Locaton_Voiture.Handlers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor



public class ErrorDto {

	
	private Integer httpCode;

	  private Integer code;

	  private String message;


	
}
