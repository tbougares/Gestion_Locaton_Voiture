package Gestion_Locaton_Voiture.Dto;

import java.time.LocalDate;
import java.util.Date;

import Gestion_Locaton_Voiture.Entity.Client;
import Gestion_Locaton_Voiture.Entity.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
	@NotBlank
	@NotEmpty
	private Integer id;
	@NotBlank
	@NotEmpty
	private String firstName;
	@NotBlank
	@NotEmpty
	private String last_Name;
	@NotBlank
	@NotEmpty
	private Gender gender;
	@NotBlank
	@NotEmpty
	private int age;
	@NotBlank
	@NotEmpty
	private AddresDto adress;
	@NotBlank
	@NotEmpty
	private String tel;
	@NotBlank
	@NotEmpty
	private String city;
	@NotBlank
	@NotEmpty
	private String country;
	@NotBlank
	@NotEmpty
	private String CIN;
	@NotBlank
	@NotEmpty
	
	
	private LocalDate date_Creation;
	@NotBlank
	@NotEmpty
	
	private String email;
	 public static ClientDto fromEntity(Client client) {
		    if (client == null) {
		      return null;
		    }
		    return ClientDto.builder()
		        .id(client.getId())
		        .firstName(client.getFirstName())
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
		    client.setFirstName(dto.getFirstName());
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
