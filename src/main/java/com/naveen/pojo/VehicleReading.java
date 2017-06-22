package com.naveen.pojo;

import com.naveen.entities.Reading;
import com.naveen.entities.Tire;
import com.naveen.entities.Vehicle;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by naveenkumar on 6/22/17.
 */
public class VehicleReading {
    private Reading reading;
    private Vehicle vehicle;

    public VehicleReading(Reading reading, Vehicle vehicle) {
        this.reading = reading;
        this.vehicle = vehicle;
    }

    public Reading getReading() {
        return reading;
    }

    public void setReading(Reading reading) {
        this.reading = reading;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    //    private String vin;
//    private String make, model;
//    private Date lastServiceDate;
//    private int year, maxFuelVolume, redlineRpm;
//    private String id;
//    private double latitude, longitude, fuelVolume;
//    private int speed, engineHp, engineRpm;
//    private boolean checkEngineLightOn, engineCoolantLow, cruiseControlOn;
//    private Date timestamp;
//    private Tire tires;
//
//    public VehicleReading(String vin, String make, String model, Date lastServiceDate, int year, int maxFuelVolume, int redlineRpm, String id, double latitude, double longitude, double fuelVolume, int speed, int engineHp, int engineRpm, boolean checkEngineLightOn, boolean engineCoolantLow, boolean cruiseControlOn, Date timestamp, Tire tires) {
//        this.vin = vin;
//        this.make = make;
//        this.model = model;
//        this.lastServiceDate = lastServiceDate;
//        this.year = year;
//        this.maxFuelVolume = maxFuelVolume;
//        this.redlineRpm = redlineRpm;
//        this.id = id;
//        this.latitude = latitude;
//        this.longitude = longitude;
//        this.fuelVolume = fuelVolume;
//        this.speed = speed;
//        this.engineHp = engineHp;
//        this.engineRpm = engineRpm;
//        this.checkEngineLightOn = checkEngineLightOn;
//        this.engineCoolantLow = engineCoolantLow;
//        this.cruiseControlOn = cruiseControlOn;
//        this.timestamp = timestamp;
//        this.tires = tires;
//    }
//    //    public VehicleReading(vin, make, model, lastServiceDate,year, maxFuelVolume, redlineRpm, id, latitude, longitude, fuelVolume, speed
////            engineHp, engineRpm, checkEngineLightOn, engineCoolantLow, cruiseControlOn, timestamp, tires){
////
////    }
//
//
//    public String getVin() {
//        return vin;
//    }
//
//    public void setVin(String vin) {
//        this.vin = vin;
//    }
//
//    public String getMake() {
//        return make;
//    }
//
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public Date getLastServiceDate() {
//        return lastServiceDate;
//    }
//
//    public void setLastServiceDate(Date lastServiceDate) {
//        this.lastServiceDate = lastServiceDate;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getMaxFuelVolume() {
//        return maxFuelVolume;
//    }
//
//    public void setMaxFuelVolume(int maxFuelVolume) {
//        this.maxFuelVolume = maxFuelVolume;
//    }
//
//    public int getRedlineRpm() {
//        return redlineRpm;
//    }
//
//    public void setRedlineRpm(int redlineRpm) {
//        this.redlineRpm = redlineRpm;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
//
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }
//
//    public double getFuelVolume() {
//        return fuelVolume;
//    }
//
//    public void setFuelVolume(double fuelVolume) {
//        this.fuelVolume = fuelVolume;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public int getEngineHp() {
//        return engineHp;
//    }
//
//    public void setEngineHp(int engineHp) {
//        this.engineHp = engineHp;
//    }
//
//    public int getEngineRpm() {
//        return engineRpm;
//    }
//
//    public void setEngineRpm(int engineRpm) {
//        this.engineRpm = engineRpm;
//    }
//
//    public boolean isCheckEngineLightOn() {
//        return checkEngineLightOn;
//    }
//
//    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
//        this.checkEngineLightOn = checkEngineLightOn;
//    }
//
//    public boolean isEngineCoolantLow() {
//        return engineCoolantLow;
//    }
//
//    public void setEngineCoolantLow(boolean engineCoolantLow) {
//        this.engineCoolantLow = engineCoolantLow;
//    }
//
//    public boolean isCruiseControlOn() {
//        return cruiseControlOn;
//    }
//
//    public void setCruiseControlOn(boolean cruiseControlOn) {
//        this.cruiseControlOn = cruiseControlOn;
//    }
//
//    public Date getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Date timestamp) {
//        this.timestamp = timestamp;
//    }
//
//    public Tire getTires() {
//        return tires;
//    }
//
//    public void setTires(Tire tires) {
//        this.tires = tires;
//    }
}
