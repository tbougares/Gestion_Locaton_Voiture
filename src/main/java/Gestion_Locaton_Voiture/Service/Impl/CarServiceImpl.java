package Gestion_Locaton_Voiture.Service.Impl;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.Car;
import Gestion_Locaton_Voiture.Repository.CarRepository;
import Gestion_Locaton_Voiture.Services.CarService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

	
	private final CarRepository carRepository; 
	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}

	

	@Override
	public Optional<Car> findById(Integer id) {
		// TODO Auto-generated method stub
		return carRepository.findById(id);
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		carRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		if (id == null) {
			return;
		}
		carRepository.deleteById(id);
	}

	@Override
	public Optional<Car> findByMatricuel(String matricuel) {
		// TODO Auto-generated method stub
		return carRepository.findByMatricule(matricuel);
	}

	

	@Override
	public List<Car> findCarByBrande(String brande) {
		// TODO Auto-generated method stub
		return carRepository.findCarByBrande(brande);
	}



	@Override
	public Car CreateOneCar(Car car) {
		// TODO Auto-generated method stub
		return carRepository.save(car);
	}



	@Override
	public Page<Car> findByModel(String model, Pageable pageable) {
		// TODO Auto-generated method stub
//		return carRepository.findByModel(PageRequest.of(pageable.getNumberOfPages(), pageable.getNumberOfPages(), pageable.s, model)));
	//return carRepository.findByModel(model,pageable);
		return null;
	}

}
