package com.nhnacademy.week.gateway.controller;

import com.nhnacademy.week.gateway.domain.users.UserAccountSignUpRequestDto;
import com.nhnacademy.week.gateway.service.GatewayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
    private GatewayService gatewayService;

    public SignUpController(GatewayService gatewayService) {
        this.gatewayService = gatewayService;
    }

    @GetMapping("/signUp")
    public String signUp(Model model){
        model.addAttribute("user", new UserAccountSignUpRequestDto());
        return "signUp";
    }
    @PostMapping("/signUp")
    public String signUpUser(@ModelAttribute UserAccountSignUpRequestDto user){
        String str = gatewayService.userSignUp(user);
        return "login";
    }
}
