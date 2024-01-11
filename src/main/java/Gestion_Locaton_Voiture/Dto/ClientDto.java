package Gestion_Locaton_Voiture.Dto;

import java.util.Date;

import Gestion_Locaton_Voiture.Entity.Client;
import Gestion_Locaton_Voiture.Entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

	private Integer id;
	
	private String First_Name;
	
	private String Last_Name;

	private Gender Gender;

	private int Age;
	
	private AddresDto Adress;
	
	private String Tel;

	private String City;
	
	private String Country;
	
	private String CIN;
	
	
	
	private Date Date_Creation;
	
	
	private String Email;
	 public static ClientDto fromEntity(Client client) {
		    if (client == null) {
		      return null;
		    }
		    return ClientDto.builder()
		        .id(client.getId())
		        .First_Name(client.getFirst_Name())
		        .Last_Name(client.getLast_Name())
		        .Gender(client.getGender())

		        .Adress(AddresDto.fromEntity(client.getAdress()))
		        .Age(client.getAge())
		        .CIN(client.getCIN())
		        .Date_Creation(client.getDate_Creation())
		        .Email(client.getEmail())
		        .Tel(client.getTel())
		        .City(client.getCity())
		        .Country(client.getCountry())
		        .build();
		  }

		  public static Client toEntity(ClientDto dto) {
		    if (dto == null) {
		      return null;
		    }
		    Client client = new Client();
		    client.setId(dto.getId());
		    client.setFirst_Name(dto.getFirst_Name());
		    client.setLast_Name(dto.getLast_Name());
		    client.setAdress(AddresDto.toEntity(dto.getAdress()));
		    client.setAge(dto.getAge());
		    client.setGender(dto.getGender());
		    client.setEmail(dto.getEmail());
		    client.setCIN(dto.getCIN());
		    client.setDate_Creation(dto.getDate_Creation());
		    client.setTel(dto.getTel());
		    client.setCity(dto.getCity());
		    client.setCountry(dto.getCountry());

		    return client;
		  }
	

}
