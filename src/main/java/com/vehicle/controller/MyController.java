package com.vehicle.controller;

import com.vehicle.entity.Vehicles;
import com.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Vehicles")
public class MyController {

    @Autowired
    private VehicleService vehicleService;

    //Add Data into DB
    @PostMapping("/addvehicle")
    public ResponseEntity<String> addVehicle(@RequestBody Vehicles vehicles)
    {
        vehicleService.saveVehicles(vehicles);
        return new ResponseEntity<>("Vehicle data Saved", HttpStatus.OK);
    }

    // Add Multiple vehicles at once
}
