package com.justvisit.justvisit.dashboard.services;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ServiceController {

    private final ServicesRepository servicesRepository;

    public ServiceController(ServicesRepository servicesRepository){
        this.servicesRepository = servicesRepository;
    }

    @GetMapping("/showPrices")
    public String serviceList(Model model){
        List<Services> servicesList = servicesRepository.findAll();
        model.addAttribute("service",servicesList);
        return "/prices";
    }
}
