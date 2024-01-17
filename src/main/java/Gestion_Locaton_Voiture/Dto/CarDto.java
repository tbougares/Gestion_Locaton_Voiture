package Gestion_Locaton_Voiture.Dto;

import java.util.List;

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Fuel;
import Gestion_Locaton_Voiture.Entity.GearBox;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

	private Integer id;
	
	private String name;

	private String brande;
	
	private String matricule;
	
	private Double mileage;
	
	private int model;
	
	private int horsPower;
	
	private Double consumption;

	private Fuel fuel;
	
	private Boolean bluetooth;
	
	private Boolean airBag;

	private GearBox gearBox;
	
	private int seat;
	
	private int door;

	
	private String style;
	
	private int size_Cofer;
	
	private Double price;
	
	private Double rate;
	
	//-------------------Assurence-------------------
		
	//-----------------------------------------------
	
    private PhotoDto photo;
	
    private List<OrderDto> orders;
    
    public static CarDto fromEntity(Car car) {
        if (car == null) {
          return null;
        }
        return CarDto.builder()
            .id(car.getId())
            .name(car.getName())
            .brande(car.getBrande())
            .matricule((car.getMatricule()))
            
            .consumption(car.getConsumption())
            .mileage(car.getMileage())
            .model(car.getModel())
            .horsPower(car.getHorsPower())
            .door(car.getDoor())
            .bluetooth(car.getBluetooth())
            .airBag(car.getAirBag())
            .fuel(car.getFuel())
            .size_Cofer(car.getSize_Cofer())
            .style(car.getStyle())
            .seat(car.getSeat())
            .price(car.getPrice())
            .gearBox(car.getGearBox())
            .rate(car.getRate())
            //.photo(car.getPhoto())
            //.(car.getModel())
            .build();
      }

    
      public static Car toEntity(CarDto dto) {
        if (dto == null) {
          return null;
        }
        Car car = new Car();
        car.setId(dto.getId());
        
        car.setName(dto.getName());
        car.setBrande(dto.getBrande());
        car.setMatricule((dto.getMatricule()));
        
        car.setConsumption(dto.getConsumption());
        car.setMileage(dto.getMileage());
        car.setModel(dto.getModel());
        car.setHorsPower(dto.getHorsPower());
        car.setDoor(dto.getDoor());
        car.setBluetooth(dto.getBluetooth());
        car.setAirBag(dto.getAirBag());
        car.setFuel(dto.getFuel());
        car.setSize_Cofer(dto.getSize_Cofer());
        car.setStyle(dto.getStyle());
        car.setSeat(dto.getSeat());
        car.setPrice(dto.getPrice());
        car.setGearBox(dto.getGearBox());
        car.setRate(dto.getRate());
        return car;
      }

}
