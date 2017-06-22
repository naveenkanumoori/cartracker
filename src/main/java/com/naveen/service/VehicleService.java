package com.naveen.service;

import com.naveen.entities.Vehicle;

import java.util.List;

/**
 * Created by naveenkumar on 6/17/17.
 */
public interface VehicleService {
    public List<Vehicle> getAll();
    public Vehicle findByVin(String id);
    public Vehicle createVehicle(Vehicle vehicle);
    public Vehicle updateVehicle(Vehicle vehicle);
}
