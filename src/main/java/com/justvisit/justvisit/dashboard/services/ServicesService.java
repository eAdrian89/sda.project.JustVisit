package com.justvisit.justvisit.dashboard.services;

import com.justvisit.justvisit.dashboard.company.Company;

import java.util.List;

public interface ServicesService {

    List<Services> findAll();

    void save(Services theServices);

    void deleteById(int theId);
}
