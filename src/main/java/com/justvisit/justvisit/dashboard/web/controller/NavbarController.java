package com.justvisit.justvisit.dashboard.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavbarController {

    @GetMapping("/showAboutUsPage")
    public String showAboutUsPage(){
        return "aboutUs";
    }
}
