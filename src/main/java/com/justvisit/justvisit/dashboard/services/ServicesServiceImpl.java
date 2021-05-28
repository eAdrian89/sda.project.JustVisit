package com.justvisit.justvisit.dashboard.services;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicesServiceImpl implements ServicesService{

    private final ServicesRepository servicesRepository;

    @Autowired
    public ServicesServiceImpl(ServicesRepository servicesRepository) {
        this.servicesRepository = servicesRepository;
    }



    @Override
    public List<Services> findAll() {
        return servicesRepository.findAll();
    }
    Services theService = null;
    @Override
    public void save(Services theServices) {
        servicesRepository.save(theService);
    }

    @Override
    public void deleteById(int theId) {
    servicesRepository.deleteById(theId);
    }
}
