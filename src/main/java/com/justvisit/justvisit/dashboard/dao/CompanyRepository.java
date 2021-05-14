package com.justvisit.justvisit.dashboard.dao;

import com.justvisit.justvisit.dashboard.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

}
