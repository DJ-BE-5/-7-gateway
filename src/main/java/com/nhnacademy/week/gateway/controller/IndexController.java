package com.nhnacademy.week.gateway.controller;

import com.nhnacademy.week.gateway.service.GatewayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private GatewayService gatewayService;

    public IndexController(GatewayService gatewayService) {
        this.gatewayService = gatewayService;
    }

    @GetMapping("/index")
    public String indexForUser(Model model){
        // api로 userId, Email, ProjectName, status 받아서 DTO로묶고 view에 전달
        return "index";
    }
}
