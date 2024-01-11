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
	
	private String Name;

	private String brande;
	
	private String Matricule;
	
	private Double Mileage;
	
	private int Model;
	
	private int HorsPower;
	
	private Double Consumption;

	private Fuel fuel;
	
	private Boolean Bluetooth;
	
	private Boolean AirBag;

	private GearBox gearBox;
	
	private int Seat;
	
	private int Door;

	
	private String style;
	
	private int Size_Cofer;
	
	private Double Price;
	
	private Double Rate;
	
	//-------------------Assurence-------------------
	
	private Boolean CDM;
	
	private Boolean Protection_Vol;
	
	private Boolean Respo_Civile;


	private Boolean Bris_Glace_Pneus;
	
	//-----------------------------------------------
	
    private PhotoDto photo;
	
    private List<OrderDto> orders;
    
    public static CarDto fromEntity(Car car) {
        if (car == null) {
          return null;
        }
        return CarDto.builder()
            .id(car.getId())
            .Name(car.getName())
            .brande(car.getBrande())
            .Matricule((car.getMatricule()))
            .CDM(car.getCDM())
            .Consumption(car.getConsumption())
            .Mileage(car.getMileage())
            .Model(car.getModel())
            .HorsPower(car.getHorsPower())
            .Door(car.getDoor())
            .Bluetooth(car.getBluetooth())
            .AirBag(car.getAirBag())
            .fuel(car.getFuel())
            .Size_Cofer(car.getSize_Cofer())
            .style(car.getStyle())
            .Seat(car.getSeat())
            .Price(car.getPrice())
            .gearBox(car.getGearBox())
            .Bris_Glace_Pneus(car.getBris_Glace_Pneus())
            .Protection_Vol(car.getProtection_Vol())
            .Respo_Civile(car.getRespo_Civile())
            .Rate(car.getRate())
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
        car.setCDM(dto.getCDM());
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
        car.setBris_Glace_Pneus(dto.getBris_Glace_Pneus());
        car.setProtection_Vol(dto.getProtection_Vol());
        car.setRespo_Civile(dto.getRespo_Civile());
        car.setRate(dto.getRate());
        return car;
      }

}
