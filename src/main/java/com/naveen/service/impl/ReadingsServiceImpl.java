package com.naveen.service.impl;

import com.naveen.entities.Reading;
import com.naveen.entities.Tire;
import com.naveen.pojo.VehicleReading;
import com.naveen.repo.ReadingsRepository;
import com.naveen.repo.TireRepository;
import com.naveen.service.ReadingsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by naveenkumar on 6/17/17.
 */
@Service
public class ReadingsServiceImpl implements ReadingsService {

    private ReadingsRepository readingsRepository;
    private TireRepository tireRepository;
    public ReadingsServiceImpl(ReadingsRepository readingsRepository, TireRepository tireRepository){
        this.readingsRepository = readingsRepository;
        this.tireRepository = tireRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Reading> findAll() {
        return this.readingsRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Reading> findByVin(String vin) {
        return this.readingsRepository.findByVin(vin);
    }

    @Override
    @Transactional
    public Reading createReading(Reading reading) {
        Tire tire = tireRepository.createTire(reading.getTires());
        return readingsRepository.createReading(reading);
    }

    @Override
    @Transactional
    public List<VehicleReading> getAlerts(String key) {
        return readingsRepository.getAlerts(key);
    }
}
