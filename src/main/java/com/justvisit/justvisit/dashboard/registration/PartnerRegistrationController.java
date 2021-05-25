package com.justvisit.justvisit.dashboard.registration;


import com.justvisit.justvisit.dashboard.partner.Partner;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "registration")
@AllArgsConstructor
public class PartnerRegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public String register( Partner request) {
        registrationService.register(request);
        return "redirect:/index";
    }


    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }


}
