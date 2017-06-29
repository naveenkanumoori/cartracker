package com.naveen.controller;

import com.naveen.entities.Reading;
import com.naveen.pojo.VehicleReading;
import com.naveen.service.ReadingsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by naveenkumar on 6/17/17.
 */
@RestController
@RequestMapping(value = "readings")
@CrossOrigin(origins = "*")
public class ReadingsController {
    private ReadingsService readingsService;
    public ReadingsController(ReadingsService readingsService){
        this.readingsService = readingsService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Reading> getAll() {
        return this.readingsService.findAll();
    }

    @RequestMapping(method=RequestMethod.GET, value="{vin}")
    public List<Reading> getReadingsByVin(@PathVariable("vin") String vin){
        return this.readingsService.findByVin(vin);
    }

    @RequestMapping(method=RequestMethod.POST, consumes="application/json", produces="application/json")
    public Reading addReading(@RequestBody Reading reading){
        return this.readingsService.createReading(reading);
    }

    @RequestMapping(method=RequestMethod.GET, value="alerts/{key}")
    public List<VehicleReading> getAlerts(@PathVariable String key){
        return readingsService.getAlerts(key);
    }

    @RequestMapping(method=RequestMethod.GET, value="/{vin}/{time}/{unit}")
    public List<Reading> getReadingsByVinWithTimeDuration(@PathVariable String vin, @PathVariable int time, @PathVariable String unit){
        return this.readingsService.getReadingsByVinWithTimeDuration(vin, time, unit);
    }

}
