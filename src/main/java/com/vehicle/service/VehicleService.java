package com.vehicle.service;

import com.vehicle.entity.Vehicles;

import java.util.List;

public interface VehicleService {

    //Save vehicle Data
    public String saveVehicles(Vehicles vehicles);

    // Save multiple vehicle data at once
    public List<Vehicles> saveAllVehicles(List<Vehicles> vehicles);

    // Get Vehicle data by ID
    Vehicles getByID(int id);

}
