package com.nhnacademy.week.gateway.service;

import com.nhnacademy.week.gateway.adapter.UserAdapter;
import com.nhnacademy.week.gateway.domain.login.UserLoginRequestDto;
import com.nhnacademy.week.gateway.domain.login.UserLoginResponseDto;
import com.nhnacademy.week.gateway.entity.user.User;
import org.springframework.stereotype.Service;

@Service
public class GatewayService {
    private final UserAdapter userAdapter;
    public GatewayService(UserAdapter userAdapter) {
        this.userAdapter = userAdapter;
    }

    public UserLoginResponseDto getUser(String userId, String password){
        UserLoginRequestDto userLoginRequestDto = new UserLoginRequestDto(userId, password);
        UserLoginResponseDto responseDto = userAdapter.getUserLogin(userLoginRequestDto);
        return responseDto;
    }
}
