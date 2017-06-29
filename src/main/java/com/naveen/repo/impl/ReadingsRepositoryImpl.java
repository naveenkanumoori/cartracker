package com.naveen.repo.impl;

import com.naveen.entities.Reading;
import com.naveen.pojo.VehicleReading;
import com.naveen.repo.ReadingsRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by naveenkumar on 6/17/17.
 */
@Repository
public class ReadingsRepositoryImpl implements ReadingsRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Reading> findAll() {
        TypedQuery<Reading> query = em.createNamedQuery("Rdng.findAll", Reading.class);
        return query.getResultList();
    }

    @Override
    public List<Reading> findByVin(String vin) {
        TypedQuery<Reading> query = em.createNamedQuery("Rdng.findByVin", Reading.class);
        query.setParameter("pVin", vin);
        return query.getResultList();
    }

    @Override
    public Reading createReading(Reading reading) {
        em.persist(reading);
        return reading;
    }

    @Override
    public List<VehicleReading> getAlerts(String key) {
        TypedQuery<VehicleReading> query = null;
        switch (key.toLowerCase()){
            case "high":
                query = em.createNamedQuery("Rdng.findHIGH", VehicleReading.class);
                break;
            case "medium":
                query = em.createNamedQuery("Rdng.findMED", VehicleReading.class);
                break;
            case "low":
                query = em.createNamedQuery("Rdng.findLOW", VehicleReading.class);
                break;
        }
        return query.getResultList();
    }

    @Override
    public List<Reading> getReadingsByVinWithTimeDuration(String vin, int time, String unit) {
        String query = "SELECT * FROM Reading WHERE timestamp > NOW() - INTERVAL "+time+" "+unit;
        return em.createNativeQuery(query, Reading.class).getResultList();
    }
}
