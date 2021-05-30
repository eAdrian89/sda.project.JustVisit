package com.justvisit.justvisit.dashboard.booking;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BookingController {


    @GetMapping("/calendar")
    String showCalendarView(){
        return "/forms/calendar";
    }



}
