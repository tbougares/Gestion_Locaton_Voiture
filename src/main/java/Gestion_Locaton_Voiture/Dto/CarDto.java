package Gestion_Locaton_Voiture.Dto;

import java.util.List;

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Entity.Fuel;
import Gestion_Locaton_Voiture.Entity.GearBox;
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
public class CarDto {
	@NotBlank
	@NotEmpty
	private Integer id;
	@NotBlank
	@NotEmpty
	private String name;
	@NotBlank
	@NotEmpty
	private String brande;
	@NotBlank
	@NotEmpty
	private String matricule;
	@NotBlank
	@NotEmpty
	private Double mileage;
	@NotBlank
	@NotEmpty
	private int model;
	@NotBlank
	@NotEmpty
	private int horsPower;
	@NotBlank
	@NotEmpty
	private Double consumption;
	@NotBlank
	@NotEmpty
	private Fuel fuel;
	@NotBlank
	@NotEmpty
	private Boolean bluetooth;
	@NotBlank
	@NotEmpty
	private Boolean airBag;
	@NotBlank
	@NotEmpty
	private GearBox gearBox;
	@NotBlank
	@NotEmpty
	private int seat;
	@NotBlank
	@NotEmpty
	private int door;

	@NotBlank
	@NotEmpty
	private String style;
	@NotBlank
	@NotEmpty
	private int size_Cofer;
	@NotBlank
	@NotEmpty
	private Double price;
	@NotBlank
	@NotEmpty
	private Double rate;
	
	//-------------------Assurence-------------------
		
	//-----------------------------------------------
	@NotBlank
	@NotEmpty
    private PhotoDto photo;
	@NotBlank
	@NotEmpty
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
