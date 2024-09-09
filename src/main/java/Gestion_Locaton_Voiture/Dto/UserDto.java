package Gestion_Locaton_Voiture.Dto;

import java.util.Date;
import java.util.List;

import Gestion_Locaton_Voiture.Entity.User;
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
public class UserDto {
	@NotBlank
	@NotEmpty
	private Integer id;
	@NotBlank
	@NotEmpty
    private Date last_CheckIn;
	@NotBlank
	@NotEmpty
	private String userName;
	@NotBlank
	@NotEmpty
	private String password;
	
	private String enabled;
	//@NotBlank
	//@NotEmpty
    //private RoleDto role;
	@NotBlank
	@NotEmpty
    private List<ReservationDto> orders;

    public static UserDto fromEntity(User user) {
        if (user == null) {
          return null;
        }
        return UserDto.builder()
            .id(user.getId())
            .last_CheckIn(user.getLast_CheckIn())
            .userName(user.getUsername())
            .password(user.getPassword())
         //   .role(RoleDto.fromEntity(user.getRole()))
            .build();

      }

      public static User toEntity(UserDto dto) {
        if (dto == null) {
          return null;
        }
        User user = new User();
        user.setId(dto.getId());
        user.setLast_CheckIn(dto.getLast_CheckIn());
        user.setUserName(dto.getUserName());
        user.setPassword(dto.getPassword());
       // user.setRole(RoleDto.toEntity(dto.getRole()));
        return user;
      }
}
