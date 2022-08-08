package com.example.car.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.car.entity.CarDetails;

@Repository
public interface CarRepository extends JpaRepository<CarDetails, Integer> {

}
