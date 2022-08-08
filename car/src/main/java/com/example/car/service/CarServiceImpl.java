package com.example.car.service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car.constants.CarStatus;
import com.example.car.dao.CarRepository;
import com.example.car.entity.CarDetails;
import com.example.car.model.CarRequest;
import com.example.car.model.CarResponse;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepository;

	/* Create/Persist a car */
	public CarResponse createCarDetails(CarRequest carRequest) {

		CarDetails carEntity = new CarDetails();
		carEntity.setBrand(carRequest.getBrand());
		carEntity.setLicensePlate(carRequest.getLicensePlate());
		carEntity.setManufacturer(carRequest.getManufacturer());
		carEntity.setOperationCity(carRequest.getOperationCity());
		carEntity.setStatus(carRequest.getCarStatus());
		LocalDateTime ldt = LocalDateTime.now();
		carEntity.setCreatedAt(ldt);
		carEntity = carRepository.save(carEntity);

		/* Response */
		CarResponse careResponse = new CarResponse();
		careResponse.setCarID(carEntity.getCarId());
		careResponse.setBrand(carEntity.getBrand());
		careResponse.setLicensePlate(carEntity.getLicensePlate());
		careResponse.setCarStatus(carEntity.getStatus());
		careResponse.setCreatedAt(carEntity.getCreatedAt());
		careResponse.setLastUpdatedAt(carEntity.getLastUpdatedAt());
		return careResponse;
	}

	/* Get all Car Details */
	public List<CarDetails> getAllCarDetails() {
		return carRepository.findAll();
	}

	/* Get a Car Details */
	public CarResponse getCarDetails(int carId) {
		/* Response */
		CarDetails carEntity = new CarDetails();
		CarResponse careResponse = new CarResponse();
		Optional<CarDetails> carDetails = carRepository.findById(carId);
		carEntity = carDetails.get();
		careResponse.setCarID(carEntity.getCarId());
		careResponse.setBrand(carEntity.getBrand());
		careResponse.setLicensePlate(carEntity.getLicensePlate());
		careResponse.setCarStatus(carEntity.getStatus());
		careResponse.setCreatedAt(carEntity.getCreatedAt());
		careResponse.setLastUpdatedAt(carEntity.getLastUpdatedAt());
		return careResponse;
	}

}
