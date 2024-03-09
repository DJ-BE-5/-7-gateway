package com.nhnacademy.week.gateway.controller;

import com.nhnacademy.week.gateway.domain.login.LoginPostDto;
import com.nhnacademy.week.gateway.domain.login.UserLoginResponseDto;
import com.nhnacademy.week.gateway.entity.user.User;
import com.nhnacademy.week.gateway.service.GatewayService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private GatewayService gatewayService;

    public LoginController(GatewayService gatewayService) {
        this.gatewayService = gatewayService;
    }

    @GetMapping("/login")
    public String loginGet(){
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@ModelAttribute LoginPostDto dto,
                            HttpServletRequest request){
        String userId = dto.getUserId();
        String password = dto.getPassword();
        UserLoginResponseDto responseDto = gatewayService.getUser(userId, password);

        /*레디스에 세션 추가*/
        HttpSession session = request.getSession(true);
        //추가
        session.setAttribute();

        return "index";
    }
}
