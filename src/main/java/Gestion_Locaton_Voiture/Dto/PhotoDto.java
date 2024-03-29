package Gestion_Locaton_Voiture.Dto;

import Gestion_Locaton_Voiture.Entity.Photo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhotoDto {

	private Integer id;
	
	private String photo_1;
	
	
	private String photo_2;
	
	private String photo_3;
	
	private String photo_4;
	
	private CarDto car;
	public static PhotoDto fromEntity(Photo photo) {
        if (photo == null) {
          return null;
        }
        return PhotoDto.builder()
            .id(photo.getId())
            .photo_1(photo.getPhoto_1())
            .photo_2(photo.getPhoto_2())
            .photo_3(photo.getPhoto_3())
            .photo_4(photo.getPhoto_4())
            .build();

      }

      public static Photo toEntity(PhotoDto dto) {
        if (dto == null) {
          return null;
        }
        Photo photo = new Photo();
        photo.setId(dto.getId());
        photo.setPhoto_1(dto.getPhoto_1());
        photo.setPhoto_2(dto.getPhoto_2());
        photo.setPhoto_3(dto.getPhoto_3());
        photo.setPhoto_4(dto.getPhoto_4());
        return photo;
      }
}
