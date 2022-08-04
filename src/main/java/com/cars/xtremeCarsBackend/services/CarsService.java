package com.cars.xtremeCarsBackend.services;

import com.cars.xtremeCarsBackend.models.Cars;
import com.cars.xtremeCarsBackend.repositories.CarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {

    @Autowired
    private CarsRepo carsRepo;

    public List<Cars> addCars(List<Cars> cars) {
        return carsRepo.saveAll(cars);
    }

    public List<Cars> getAll() {
        return carsRepo.findAll();
    }

    public Cars getById(int id) {
        return carsRepo.findById(id).get();
    }

    public Cars updateValues(Cars cars, int id) {
        Cars carsDb = carsRepo.findById(id).get();
        carsDb.setUserName(cars.getUserName());
        carsDb.setContactNumber(cars.getContactNumber());
        carsDb.setCity(cars.getCity());
        return carsRepo.save(carsDb);
    }

    public void deleteCar(int id) {
        carsRepo.deleteById(id);
    }
}
