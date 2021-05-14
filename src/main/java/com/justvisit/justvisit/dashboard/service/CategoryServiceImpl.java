package com.justvisit.justvisit.dashboard.service;

import com.justvisit.justvisit.dashboard.dao.CategoryRepository;
import com.justvisit.justvisit.dashboard.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(int theId) {
        return null;
    }

    @Override
    public void save(Category theProduct) {
        categoryRepository.save(theProduct);

    }

    @Override
    public void deleteById(int theId) {

    }
}
