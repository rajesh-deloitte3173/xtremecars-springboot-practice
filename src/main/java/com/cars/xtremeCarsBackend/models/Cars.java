package com.cars.xtremeCarsBackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cars {
    @Id
    @SequenceGenerator(
            name = "cars_sequence",
            sequenceName = "cars_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cars_sequence"
    )
    private int id;
    private String type;
    private String brand;
    private float cost;
    private String fuelType;
    private String engine;
    private String torque;
    private String accelarition;
    private String topSpeed;
    private String exteriorColor;
    private String interiorColor;
    private String userName;
    private String contactNumber;
    private String city;
}
