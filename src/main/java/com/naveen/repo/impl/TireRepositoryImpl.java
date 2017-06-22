package com.naveen.repo.impl;

import com.naveen.entities.Tire;
import com.naveen.repo.TireRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by naveenkumar on 6/18/17.
 */
@Repository
public class TireRepositoryImpl implements TireRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Tire createTire(Tire tire) {
        em.persist(tire);
        return tire;
    }
}
