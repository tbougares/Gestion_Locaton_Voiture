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
	
	private String first_Name;
	
	private String last_Name;

	private Gender gender;

	private int age;
	
	private AddresDto adress;
	
	private String tel;

	private String city;
	
	private String country;
	
	private String CIN;
	
	
	
	private Date date_Creation;
	
	
	private String email;
	 public static ClientDto fromEntity(Client client) {
		    if (client == null) {
		      return null;
		    }
		    return ClientDto.builder()
		        .id(client.getId())
		        .first_Name(client.getFirst_Name())
		        .last_Name(client.getLast_Name())
		        .gender(client.getGender())

		        .adress(AddresDto.fromEntity(client.getAdress()))
		        .age(client.getAge())
		        .CIN(client.getCIN())
		        .date_Creation(client.getDate_Creation())
		        .email(client.getEmail())
		        .tel(client.getTel())
		        .city(client.getCity())
		        .country(client.getCountry())
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
