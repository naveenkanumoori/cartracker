package com.naveen.service.impl;

import com.naveen.entities.Vehicle;
import com.naveen.repo.VehicleRepository;
import com.naveen.service.VehicleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by naveenkumar on 6/17/17.
 */
@Service
public class VehicleServiceImpl implements VehicleService {


    private VehicleRepository repository;
    public VehicleServiceImpl(VehicleRepository repository){
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Vehicle> getAll() {
        return repository.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Vehicle findByVin(String vin) {
        return repository.findByVin(vin);
    }

    @Override
    @Transactional
    public Vehicle createVehicle(Vehicle vehicle) {
        Vehicle existingVehicle =  repository.findByVin(vehicle.getVin());
        if(existingVehicle == null){
            return repository.createVehicle(vehicle);
        }

        return updateVehicle(vehicle);
    }

    @Override
    @Transactional
    public Vehicle updateVehicle(Vehicle vehicle) {
        return repository.updateVehicle(vehicle);
    }
}
