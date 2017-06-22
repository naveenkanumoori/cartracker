package com.naveen.controller;

import com.naveen.entities.Vehicle;
import com.naveen.service.VehicleService;
import com.naveen.wrapper.VehicleWrapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by naveenkumar on 6/17/17.
 */
@RestController
@RequestMapping(value = "vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {

    private VehicleService vehicleService;
    public VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Vehicle> getAll(){
        return this.vehicleService.getAll();
    }

    @RequestMapping(method=RequestMethod.PUT, consumes="application/json", produces="application/json")
    public List<Vehicle> addVehicles(@RequestBody VehicleWrapper wrapper){
        for(Vehicle vehicle : wrapper){
            this.vehicleService.createVehicle(vehicle);
        }
        return wrapper;
    }
}
