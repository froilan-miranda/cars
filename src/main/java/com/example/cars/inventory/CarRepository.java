package com.example.cars.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

    List<CarEntity> findAll();
    List<CarEntity> findByMake(String make);
    List<CarEntity> findByModel(String model);
    List<CarEntity> findByMakeAndModel(String make, String model);

}
