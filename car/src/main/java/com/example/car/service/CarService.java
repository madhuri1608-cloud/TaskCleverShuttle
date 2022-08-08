package com.example.car.service;

import java.util.List;

import com.example.car.entity.CarDetails;
import com.example.car.model.CarRequest;
import com.example.car.model.CarResponse;

public interface CarService {

	public CarResponse createCarDetails(CarRequest carRequest);

	public List<CarDetails> getAllCarDetails();

	public CarResponse getCarDetails(int  carID);
}
