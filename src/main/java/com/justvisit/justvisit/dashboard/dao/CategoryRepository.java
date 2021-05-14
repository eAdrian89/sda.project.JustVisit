package com.justvisit.justvisit.dashboard.dao;

import com.justvisit.justvisit.dashboard.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
