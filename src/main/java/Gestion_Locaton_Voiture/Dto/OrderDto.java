package Gestion_Locaton_Voiture.Dto;

import java.util.Date;

import Gestion_Locaton_Voiture.Entity.Reservation;
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
public class OrderDto {
	@NotBlank
	@NotEmpty
	private Integer id;
	@NotBlank
	@NotEmpty
	private String country;
	@NotBlank
	@NotEmpty
	private String bookingCity;
	@NotBlank
	@NotEmpty
	private String returnCity;
	@NotBlank
	@NotEmpty
	private Date startDate;
	@NotBlank
	@NotEmpty
	private Date endDate;
	@NotBlank
	@NotEmpty
	private int clientAge;
	@NotBlank
	@NotEmpty	
	private String OrderStatus;
	@NotBlank
	@NotEmpty
    private CarDto car;
	@NotBlank
	@NotEmpty
    private UserDto user;
    public static OrderDto fromEntity(Reservation order) {
        if (order == null) {
          return null;
        }
        return OrderDto.builder()
            .id(order.getId())
            .country(order.getCountry())
            //.bookingCity(order.getBookingCity())
            //.returnCity(order.getReturnCity())
        //    .car(CarDto.fromEntity(order.getCar()))
            //.clientAge(order.getClientAge())
            //.endDate(order.getEndDate())
            //.OrderStatus(order.getOrderStatus())
          ///  .startDate(order.getStartDate())



            .build();

      }

      public static Reservation toEntity(OrderDto dto) {
        if (dto == null) {
          return null;
        }
        Reservation order = new Reservation();
        order.setId(dto.getId());
        order.setCountry(dto.getCountry());
       // order.setBookingCity(dto.getBookingCity());
        //order.setReturnCity(dto.getReturnCity());
        //order.setCar(CarDto.toEntity(dto.getCar()));
        //order.setClientAge(dto.getClientAge());
        //order.setEndDate(dto.getEndDate());
        //order.setOrderStatus(dto.getOrderStatus());
        //order.setStartDate(dto.getStartDate());
        return order;
      }
}
