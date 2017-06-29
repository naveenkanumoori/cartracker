package com.naveen.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by naveenkumar on 6/17/17.
 */
@NamedQueries({
        @NamedQuery(name="Rdng.findAll", query="SELECT r FROM Reading r"),
        @NamedQuery(name="Rdng.findByVin", query="SELECT r FROM Reading r WHERE r.vin=:pVin"),
        @NamedQuery(name="Rdng.findHIGH", query="SELECT NEW com.naveen.pojo.VehicleReading(r, v) FROM Reading r LEFT JOIN Vehicle v ON r.vin = v.vin WHERE timeDifference(r.timestamp, 2) = 1 AND r.engineRpm > v.redlineRpm"),
        @NamedQuery(name="Rdng.findMED", query="SELECT NEW com.naveen.pojo.VehicleReading(r, v) FROM Reading r LEFT JOIN Vehicle v ON r.vin = v.vin WHERE timeDifference(r.timestamp, 2) = 1 AND r.fuelVolume < 0.10 * v.maxFuelVolume"),
        @NamedQuery(name="Rdng.findLOW", query="SELECT NEW com.naveen.pojo.VehicleReading(r, v) FROM Reading r LEFT JOIN Vehicle v ON r.vin = v.vin LEFT JOIN Tire t ON r.tires.id = t.id WHERE timeDifference(r.timestamp, 2) = 1 AND r.checkEngineLightOn = 1 OR r.engineCoolantLow = 1 OR checkTP(t.frontLeft) = 1 OR checkTP(t.frontRight) = 1 OR checkTP(t.rearRight) = 1 OR checkTP(t.rearLeft) = 1")
})
//select * from (Reading r LEFT JOIN Vehicle v ON r.vin = v.vin) LEFT JOIN Tire t ON Reading.tires_id = Tire.id
@Entity
public class  Reading {

    @Id
    private String id;

    private String vin;
    private double latitude, longitude, fuelVolume;
    private int speed, engineHp, engineRpm;
    private boolean checkEngineLightOn, engineCoolantLow, cruiseControlOn;
    private Date timestamp;

    @OneToOne
    private Tire tires;

    public Reading() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(int engineHp) {
        this.engineHp = engineHp;
    }

    public int getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(int engineRpm) {
        this.engineRpm = engineRpm;
    }

    public boolean isCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public boolean isEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public Tire getTires() {
        return tires;
    }

    public void setTires(Tire tires) {
        this.tires = tires;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}