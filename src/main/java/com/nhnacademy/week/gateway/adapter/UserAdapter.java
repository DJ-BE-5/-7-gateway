package com.nhnacademy.week.gateway.adapter;

import com.nhnacademy.week.gateway.domain.login.UserLoginRequestDto;
import com.nhnacademy.week.gateway.domain.login.UserLoginResponseDto;
import com.nhnacademy.week.gateway.entity.user.User;

public interface UserAdapter {
    UserLoginResponseDto getUserLogin(UserLoginRequestDto dto);
}
