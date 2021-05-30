package com.justvisit.justvisit.dashboard.services;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @PostMapping("/showPrices{id}")
    public String bookDate( Model model, @PathVariable int id){
       Optional<Services> service = servicesRepository.findById(id);
       model.addAttribute("service", service);
               return "redirect:/calendar";
    }

}
