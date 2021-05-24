package com.justvisit.justvisit.dashboard.web.controller;

import com.justvisit.justvisit.dashboard.category.Category;
import com.justvisit.justvisit.dashboard.category.CategoryService;
import com.justvisit.justvisit.dashboard.company.Company;
import com.justvisit.justvisit.dashboard.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/")
public class AdminController {

    private final CategoryService categoryService;
    private final CompanyService companyService;

    @Autowired
    public AdminController(CategoryService categoryService, CompanyService companyService) {
        this.categoryService = categoryService;
        this.companyService = companyService;
    }

   @GetMapping("/list")
    public String listCategories(Model model) {
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute("categories", categoryList);
        return "admin";
    }

    @GetMapping("/companyList")
    public String companiesList(Model model) {
        List<Company> companyList = companyService.findAll();
        model.addAttribute("company", companyList);
        return "forms/companyForm";

    }


}