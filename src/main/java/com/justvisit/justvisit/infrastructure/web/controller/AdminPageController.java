package com.justvisit.justvisit.infrastructure.web.controller;

import com.justvisit.justvisit.dashboard.partner.Partner;
import com.justvisit.justvisit.dashboard.partner.PartnerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class AdminPageController {

    private final PartnerRepository partnerRepository;

    public AdminPageController(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }
//    @RequestMapping("adminPage/{partnerId}")
//    public String adminPage(Model model, @PathVariable("partnerId") Long partnerId, Principal principal){
//
//        Optional<Partner> byId = partnerRepository.findById(partnerId);
//        List<Partner> collect = byId.stream().filter(partner -> partner.getId().equals(partnerId)).collect(Collectors.toList());
//        for (Partner partner : collect) {
//            model.addAttribute("partner",partner);
//            model.addAttribute("principal",principal);
//        }
//        return "/admin/adminPage";
//    }

//    @GetMapping("adminPage/{partnerId}")
//    public String adminPage(Model model, @PathVariable("partnerId") Long partnerId, Principal principal) {
//        Optional<Partner> partnerRepositoryById = partnerRepository.findById(partnerId);
//        List<Partner> collect = partnerRepositoryById.stream().filter(partner -> partner.getId().equals(partnerId)).collect(Collectors.toList());
//        for (Partner partner : collect) {
//            if (principal.getName().equals(partner.getEmail())){
//                model.addAttribute("partner", partner);
//            }
//        }
//        return "/admin/adminPage";
//    }


    @GetMapping("adminPartnerPage")
    public String adminPage(Model model, Principal principal) {
        List<Partner> partnerList = partnerRepository.findAll();
        for (Partner partner : partnerList) {
            if (partner.getEmail().equals(principal.getName())) {
                model.addAttribute("partner", partner);
            }
        }
        return "/admin/adminPage";
    }
}
