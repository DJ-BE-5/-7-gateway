package com.nhnacademy.week.gateway.controller;

import com.nhnacademy.week.gateway.domain.users.UserGetAllResponseDto;
import com.nhnacademy.week.gateway.entity.user.User;
import com.nhnacademy.week.gateway.service.GatewayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    private GatewayService gatewayService;

    public UserController(GatewayService gatewayService) {
        this.gatewayService = gatewayService;
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        // 프로젝트 생성 후 멤버 등록 시 USER등록 위해 USER LIST 받아오는 method
        List<UserGetAllResponseDto> userList = gatewayService.getAllUser();
        model.addAttribute("userList", userList);

        return "findUsers";
    }
}
