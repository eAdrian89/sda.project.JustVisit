package com.justvisit.justvisit.dashboard.company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();

    Company findById(int theId);

    void save(Company theCompany);

    void deleteById(int theId);
}
