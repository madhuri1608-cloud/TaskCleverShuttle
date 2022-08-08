package com.example.car.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.example.car.constants.CarStatus;
import com.sun.istack.NotNull;

@Table(name = "CarDetails")
@Entity

public class CarDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;

	@Column(name = "Brand", length = 50)
	@NotNull
	private String brand;

	@Column(name = "LicensePlate", length = 15)
	@NotNull
	private String licensePlate;

	@Column(name = "Manufacturer", length = 50)

	private String manufacturer;

	@Column(name = "OperationCity", length = 100)
	private String operationCity;

	@Enumerated(EnumType.ORDINAL)
	@NotNull
	private CarStatus status;

	@Column(name = "CreatedAt")
	@CreatedDate
	@NotNull
	private LocalDateTime createdAt;

	@Column(name = "LastUpdatedAt")
	@LastModifiedDate

	private LocalDateTime lastUpdatedAt;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getBrand() {
		return brand;
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOperationCity() {
		return operationCity;
	}

	public void setOperationCity(String operationCity) {
		this.operationCity = operationCity;
	}

	public CarStatus getStatus() {
		return status;
	}

	public void setStatus(CarStatus status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

}
