package com.vehicle.serviceImpl;

import com.vehicle.entity.Vehicles;
import com.vehicle.repository.VehicleRepo;
import com.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;



    @Override
    public String saveVehicles(Vehicles vehicles) {
    Vehicles vehicles1 = vehicleRepo.save(vehicles);
        return "Vehicle info Saved Successfully";
    }

}
