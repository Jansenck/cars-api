package com.cars.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.carsDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @PostMapping
    public void create(@RequestBody carsDTO req){
        System.out.println(req);
    }
}
