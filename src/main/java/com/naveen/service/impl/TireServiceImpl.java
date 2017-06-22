package com.naveen.service.impl;

import com.naveen.entities.Tire;
import com.naveen.repo.TireRepository;
import com.naveen.service.TireService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by naveenkumar on 6/18/17.
 */
@Service
public class TireServiceImpl implements TireService {

    private TireRepository tireRepository;

    public TireServiceImpl(TireRepository tireRepository){
        this.tireRepository = tireRepository;
    }

    @Override
    @Transactional
    public Tire createTire(Tire tire) {
        return tireRepository.createTire(tire);
    }
}
