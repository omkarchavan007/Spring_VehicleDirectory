package com.vehicle.serviceImpl;

import com.vehicle.entity.Vehicles;
import com.vehicle.repository.VehicleRepo;
import com.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public String saveVehicles(Vehicles vehicles) {
    Vehicles vehicles1 = vehicleRepo.save(vehicles);
        return "Vehicle info Saved Successfully";
    }

    @Override
    public List<Vehicles> saveAllVehicles(List<Vehicles> vehicles) {

       List <Vehicles> vehicles1 = vehicleRepo.saveAll(vehicles);
        return List.of();
    }

    @Override
    public Vehicles getByID(int id) {
       Vehicles getVehicle = vehicleRepo.findById(id).orElseThrow(() -> new NullPointerException("Id not found"+id));
        return getVehicle;
    }

}
