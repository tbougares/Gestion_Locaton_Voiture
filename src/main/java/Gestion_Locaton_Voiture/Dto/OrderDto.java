package Gestion_Locaton_Voiture.Dto;

import java.util.Date;

import Gestion_Locaton_Voiture.Entity.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

	private Integer id;
	
	private String country;

	private String Booking_City;

	private String Return_City;
	
	private Date Start_Date;
	
	private Date End_Date;
	
	private int Client_Age;
	
	
	
	private String Order_Status;
	
    private CarDto car;
	
    private UserDto user;
    public static OrderDto fromEntity(Order order) {
        if (order == null) {
          return null;
        }
        return OrderDto.builder()
            .id(order.getId())
            .country(order.getCountry())
            .Booking_City(order.getBooking_City())
            .Return_City(order.getReturn_City())
            .car(CarDto.fromEntity(order.getCar()))
            .Client_Age(order.getClient_Age())
            .End_Date(order.getEnd_Date())
            .Order_Status(order.getOrder_Status())
            .Start_Date(order.getStart_Date())



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
