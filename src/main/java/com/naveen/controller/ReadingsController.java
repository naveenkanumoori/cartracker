package com.naveen.controller;

import com.naveen.entities.Reading;
import com.naveen.pojo.VehicleReading;
import com.naveen.service.ReadingsService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value="Fetch all Readings", notes="Returns a list of readings till date")
    @ApiResponses(value={
            @ApiResponse(code = 200, message="Success"),
            @ApiResponse(code = 500, message="Internal Server Error")
    })
    public List<Reading> getAll() {
        return this.readingsService.findAll();
    }

    @RequestMapping(method=RequestMethod.GET, value="{vin}")
    @ApiOperation(value="Fetch Reading be VIN", notes="Returns a list of readings for specific vehicle based on its VIN")
    @ApiResponses(value={
            @ApiResponse(code = 200, message="Success"),
            @ApiResponse(code = 404, message="Not Found"),
            @ApiResponse(code = 500, message="Internal Server Error")
    })
    public List<Reading> getReadingsByVin(@PathVariable("vin") String vin){
        return this.readingsService.findByVin(vin);
    }

    @RequestMapping(method=RequestMethod.POST, consumes="application/json", produces="application/json")
    @ApiOperation(value="Add Reading", notes="Creates Reading and returns the same")
    @ApiResponses(value={
            @ApiResponse(code = 200, message="Success"),
            @ApiResponse(code = 400, message="Bad Request"),
            @ApiResponse(code = 500, message="Internal Server Error")
    })
    public Reading addReading(@RequestBody Reading reading){
        return this.readingsService.createReading(reading);
    }

    @RequestMapping(method=RequestMethod.GET, value="alerts/{key}")
    @ApiOperation(value="Fetch all alerts", notes="Returns a list of alerts{reading, vehicle} details created with in last 2 hours")
    @ApiResponses(value={
            @ApiResponse(code = 200, message="Success"),
            @ApiResponse(code = 500, message="Internal Server Error")
    })
    public List<VehicleReading> getAlerts(@PathVariable String key){
        return readingsService.getAlerts(key);
    }

    @RequestMapping(method=RequestMethod.GET, value="/{vin}/{time}/{unit}")
    @ApiOperation(value="Fetch all readings based on VIN and time duration", notes="Returns a list of vehicle's readings over a user selected time range, e.g. fuelVolume over 2 hours, engineRpm over last 15minutes")
    @ApiResponses(value={
            @ApiResponse(code = 200, message="Success"),
            @ApiResponse(code = 500, message="Internal Server Error")
    })
    public List<Reading> getReadingsByVinWithTimeDuration(@PathVariable String vin, @PathVariable int time, @PathVariable String unit){
        return this.readingsService.getReadingsByVinWithTimeDuration(vin, time, unit);
    }

}
