package com.vehicle.repository;

import com.vehicle.entity.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicles, Integer> {


}
