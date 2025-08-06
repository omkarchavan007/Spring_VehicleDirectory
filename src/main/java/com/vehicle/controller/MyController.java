package com.vehicle.controller;

import com.vehicle.entity.Vehicles;
import com.vehicle.repository.VehicleRepo;
import com.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Vehicles")
public class MyController {

    @Autowired
    private VehicleService vehicleService;

    //Add Data into DB
    @PostMapping("/addvehicle")
    public ResponseEntity<String> addVehicle(@RequestBody Vehicles vehicles) {
        vehicleService.saveVehicles(vehicles);
        return new ResponseEntity<>("Vehicle data Saved", HttpStatus.OK);
    }

    // Add Multiple vehicles at once
    @PostMapping("/addMultipleVehicles")
    public ResponseEntity<List<Vehicles>> addMultipleVehicles(@RequestBody List<Vehicles> vehicles) {
        List<Vehicles> vehicleslist = vehicleService.saveAllVehicles(vehicles);
        return new ResponseEntity<>(vehicleslist, HttpStatus.OK);
    }

    @GetMapping("/getVehicleById/{id}")
    public ResponseEntity <Vehicles> getVehicleByID(@PathVariable("id") int id)
    {
    Vehicles vehicles =vehicleService.getByID(id);
    return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }
}
