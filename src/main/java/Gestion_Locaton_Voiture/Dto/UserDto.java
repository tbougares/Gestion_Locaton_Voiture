package Gestion_Locaton_Voiture.Dto;

import java.util.Date;
import java.util.List;

import Gestion_Locaton_Voiture.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private Integer id;
	
    private Date last_CheckIn;
	
	private String userName;
	
	private String passWord;
	
    private RoleDto role;
	
    private List<OrderDto> orders;

    public static UserDto fromEntity(User user) {
        if (user == null) {
          return null;
        }
        return UserDto.builder()
            .id(user.getId())
            .last_CheckIn(user.getLast_CheckIn())
            .userName(user.getUserName())
            .passWord(user.getPassWord())
            .role(RoleDto.fromEntity(user.getRole()))
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
        user.setPassWord(dto.getPassWord());
        user.setRole(RoleDto.toEntity(dto.getRole()));
        return user;
      }
}
