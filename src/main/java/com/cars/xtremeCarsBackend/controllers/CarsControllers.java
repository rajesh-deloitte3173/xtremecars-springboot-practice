package com.cars.xtremeCarsBackend.controllers;

import com.cars.xtremeCarsBackend.models.Cars;
import com.cars.xtremeCarsBackend.services.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/cars")
public class CarsControllers {

    @Autowired
    private CarsService carsService;

    @CrossOrigin
    @PostMapping("/all")
    private List<Cars> addCars(@RequestBody List<Cars> cars){
        return carsService.addCars(cars);
    }

    @CrossOrigin
    @GetMapping
    private List<Cars> getAll(){
        return carsService.getAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    private Cars getById(@PathVariable("id") int id){
        return carsService.getById(id);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    private Cars updateValues(@RequestBody Cars cars, @PathVariable("id") int id){
        return carsService.updateValues(cars,id);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    private void deleteCar(@PathVariable("id") int id){
        carsService.deleteCar(id);
    }
}
