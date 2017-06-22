package com.naveen.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by naveenkumar on 6/17/17.
 */

@NamedQueries({
        @NamedQuery(name="Vhcl.findAll", query="SELECT u FROM Vehicle u"),
        @NamedQuery(name="Vhcl.findById", query="SELECT u FROM Vehicle u WHERE u.id=:pId"),
        @NamedQuery(name="Vhcl.findByVin", query="SELECT u FROM Vehicle u WHERE u.vin=:pVin")
})

@Entity
public class Vehicle {

    @Id
    private String vin;
    private String make, model;
    private Date lastServiceDate;
    private int year, maxFuelVolume, redlineRpm;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Date getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(int maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public int getRedlineRpm() {
        return redlineRpm;
    }

    public void setRedlineRpm(int redlineRpm) {
        this.redlineRpm = redlineRpm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
