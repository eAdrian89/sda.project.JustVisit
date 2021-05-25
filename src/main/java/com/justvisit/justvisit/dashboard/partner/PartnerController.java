package com.justvisit.justvisit.dashboard.partner;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("registerPartner")
public class PartnerController {


    @GetMapping
    public String showPartnerLoginPage(Model model) {
        model.addAttribute("partner", new Partner());
        return "forms/partnerRegistrationForm";
    }

    @GetMapping("login")
    public String partnerLogin(Model model) {
        return "";
    }


}
