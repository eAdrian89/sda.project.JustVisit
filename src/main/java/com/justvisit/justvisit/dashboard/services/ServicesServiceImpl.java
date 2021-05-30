package com.justvisit.justvisit.dashboard.services;

import com.justvisit.justvisit.dashboard.category.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServicesServiceImpl implements ServicesService {

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

    @Override
    public Services findById(int theId) {
        Optional<Services> result = servicesRepository.findById(theId);

        Services service = null;

        if (result.isPresent()) {
            service = result.get();
        } else {
            // we didn't find the product
            throw new RuntimeException("Did not find product id - " + theId);
        }

        return service;
    }

}
