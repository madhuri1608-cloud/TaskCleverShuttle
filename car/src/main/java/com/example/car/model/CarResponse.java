package com.example.car.model;

import java.time.LocalDateTime;
import java.util.Date;

import com.example.car.constants.CarStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@JsonInclude(Include.NON_NULL)
public class CarResponse {

	@JsonProperty(value = "carID", access = Access.READ_ONLY)
	private int carID;
	@JsonProperty(value = "brand", access = Access.READ_ONLY)
	private String brand;
	@JsonProperty(value = "licensePlate", access = Access.READ_ONLY)
	private String licensePlate;
	@JsonProperty(value = "carStatus", access = Access.READ_ONLY)
	private CarStatus carStatus;

	@JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "CET" ,pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	@JsonProperty(value = "createdAt", access = Access.READ_ONLY)
	private LocalDateTime createdAt;
	

	@JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "CET", pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	@JsonProperty(value = "LastUpdatedAt", access = Access.READ_ONLY)
	private LocalDateTime LastUpdatedAt;

	
	
	public CarStatus getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(CarStatus carStatus) {
		this.carStatus = carStatus;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getBrand() {
		return brand;
	}

	public int getCarID() {
		return carID;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getLastUpdatedAt() {
		return LastUpdatedAt;
	}

	public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
		LastUpdatedAt = lastUpdatedAt;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

}
