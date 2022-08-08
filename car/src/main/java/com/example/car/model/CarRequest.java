package com.example.car.model;

import java.util.Date;

import com.example.car.constants.CarStatus;

public class CarRequest {

	/*
	 * Id int Brand varchar(50) LicensePlate varchar(15) Manufacturer varchar(50)
	 * OperationCity varchar(100) Status enum (values: available, in-maintenance,
	 * out-of-service) CreatedAt datetime LastUpdatedAt datetime
	 */

	private int carID;
	private String brand;
	private String manufacturer;
	private String licensePlate;
	private String operationCity;
	private CarStatus carStatus;

	public CarStatus getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(CarStatus carStatus) {
		this.carStatus = carStatus;
	}



	

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getOperationCity() {
		return operationCity;
	}

	public void setOperationCity(String operationCity) {
		operationCity = operationCity;
	}

}
