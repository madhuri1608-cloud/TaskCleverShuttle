package com.example.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.entity.CarDetails;
import com.example.car.model.CarRequest;
import com.example.car.model.CarResponse;
import com.example.car.service.CarService;
import com.example.car.service.CarServiceImpl;

@RestController
@RequestMapping("/car")

public class CarController {

	@Autowired
	CarService carService;

	@GetMapping("/getAll")
	public List<CarDetails> getAll() {
		return carService.getAllCarDetails();
	}

	
	@GetMapping("/getCar/{carId}")
	public CarResponse getCarDetails(@PathVariable("carId") int carId) {
		return carService.getCarDetails(carId);
	}

	@PostMapping("/create")
	public CarResponse createCarDetails(@RequestBody CarRequest carRequest) {
		return carService.createCarDetails(carRequest);
	}

}
