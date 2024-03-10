package com.nhnacademy.week.gateway.adapter;

import com.nhnacademy.week.gateway.domain.login.UserLoginRequestDto;
import com.nhnacademy.week.gateway.domain.login.UserLoginResponseDto;
import com.nhnacademy.week.gateway.domain.users.UserAccountSignUpRequestDto;
import com.nhnacademy.week.gateway.domain.users.UserGetAllResponseDto;
import com.nhnacademy.week.gateway.entity.user.User;

import java.util.List;

public interface UserAdapter {
    UserLoginResponseDto getUserLogin(UserLoginRequestDto dto);
    List<UserGetAllResponseDto> getAllUsers();
    String registerUser(UserAccountSignUpRequestDto dto);
}
