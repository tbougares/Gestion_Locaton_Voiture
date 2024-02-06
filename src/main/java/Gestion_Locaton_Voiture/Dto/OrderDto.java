package Gestion_Locaton_Voiture.Dto;

import java.util.Date;

import Gestion_Locaton_Voiture.Entity.Order;
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
	private String booking_City;
	@NotBlank
	@NotEmpty
	private String return_City;
	@NotBlank
	@NotEmpty
	private Date start_Date;
	@NotBlank
	@NotEmpty
	private Date end_Date;
	@NotBlank
	@NotEmpty
	private int client_Age;
	@NotBlank
	@NotEmpty	
	private String Order_Status;
	@NotBlank
	@NotEmpty
    private CarDto car;
	@NotBlank
	@NotEmpty
    private UserDto user;
    public static OrderDto fromEntity(Order order) {
        if (order == null) {
          return null;
        }
        return OrderDto.builder()
            .id(order.getId())
            .country(order.getCountry())
            .booking_City(order.getBooking_City())
            .return_City(order.getReturn_City())
            .car(CarDto.fromEntity(order.getCar()))
            .client_Age(order.getClient_Age())
            .end_Date(order.getEnd_Date())
            .Order_Status(order.getOrder_Status())
            .start_Date(order.getStart_Date())



            .build();

      }

      public static Order toEntity(OrderDto dto) {
        if (dto == null) {
          return null;
        }
        Order order = new Order();
        order.setId(dto.getId());
        order.setCountry(dto.getCountry());
        order.setBooking_City(dto.getBooking_City());
        order.setReturn_City(dto.getReturn_City());
        order.setCar(CarDto.toEntity(dto.getCar()));
        order.setClient_Age(dto.getClient_Age());
        order.setEnd_Date(dto.getEnd_Date());
        order.setOrder_Status(dto.getOrder_Status());
        order.setStart_Date(dto.getStart_Date());
        return order;
      }
}
