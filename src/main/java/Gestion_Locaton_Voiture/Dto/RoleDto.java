package Gestion_Locaton_Voiture.Dto;

import java.util.List;
import java.util.stream.Collectors;

import Gestion_Locaton_Voiture.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
	
	private Integer id;

	
	private String Name;


    private List<UserDto> user;

    public static RoleDto fromEntity(Role role) {
        if (role == null) {
          return null;
        }
        return RoleDto.builder()
            .id(role.getId())
            .Name(role.getName())
            .user(
            		role.getUser() != null ?
                            role.getUser().stream()
                            .map(UserDto::fromEntity)
                            .collect(Collectors.toList()) : null
            		)
            
            
            .build();

      }

      public static Role toEntity(RoleDto dto) {
        if (dto == null) {
          return null;
        }
        Role role = new Role();
        role.setId(dto.getId());
        role.setName(dto.getName());
        
        return role;
      }
}
