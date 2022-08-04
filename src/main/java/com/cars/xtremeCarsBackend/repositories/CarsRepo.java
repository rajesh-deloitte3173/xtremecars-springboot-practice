package com.cars.xtremeCarsBackend.repositories;

import com.cars.xtremeCarsBackend.models.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepo extends JpaRepository<Cars,Integer> {
}
