package com.justvisit.justvisit.dashboard.category;

import com.justvisit.justvisit.dashboard.category.Category;
import com.justvisit.justvisit.dashboard.category.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/")
    public String categoriesList(Model model){
        List<Category>categoryList = categoryService.findAll();
        model.addAttribute("categories",categoryList);
        return "index";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Category category = new Category();
        model.addAttribute("categories", category);
        return "forms/categoryForm";
    }

    @PostMapping("/save")
    public String saveCategory(@ModelAttribute("category")Category category){
        categoryService.save(category);
        return "redirect:/showFormForAdd";
    }
}
