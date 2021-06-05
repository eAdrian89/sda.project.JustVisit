package com.justvisit.justvisit.dashboard.booking;


import com.justvisit.justvisit.dashboard.services.Services;
import com.justvisit.justvisit.dashboard.services.ServicesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class BookingController {

    private final ServicesRepository servicesRepository;


    public BookingController(ServicesRepository servicesRepository) {
        this.servicesRepository = servicesRepository;
    }

    @GetMapping("/showCalendar/{id}")
    String showCalendarView() {
        return "/forms/calendar";
    }

    @PostMapping("/showCalendar/{id}")
    String showCalendarView(@PathVariable int id, Model model) {


      Optional<Services> services = servicesRepository.findById(id);
       model.addAttribute("services", services);
      System.out.println(services);


        return "/forms/calendar";
    }


}
