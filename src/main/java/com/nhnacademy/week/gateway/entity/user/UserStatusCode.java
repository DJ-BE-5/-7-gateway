package com.nhnacademy.week.gateway.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserStatusCode {
    SIGN_UP("가입"), WITHDRAW("탈퇴"), DORMANCY("휴면");
    private String value;
}
