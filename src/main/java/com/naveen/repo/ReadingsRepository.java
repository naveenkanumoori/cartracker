package com.naveen.repo;

import com.naveen.entities.Reading;
import com.naveen.pojo.VehicleReading;

import java.util.List;

/**
 * Created by naveenkumar on 6/17/17.
 */
public interface ReadingsRepository {
    public List<Reading> findAll();
    public List<Reading> findByVin(String vin);
    public Reading createReading(Reading reading);
    public List<VehicleReading> getAlerts(String key);
}
