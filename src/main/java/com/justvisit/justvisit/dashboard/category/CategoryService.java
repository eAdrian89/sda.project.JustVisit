package com.justvisit.justvisit.dashboard.category;

import com.justvisit.justvisit.dashboard.category.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(int theId);

    void save(Category theProduct);

    void deleteById(int theId);

}
