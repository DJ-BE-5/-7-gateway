package com.nhnacademy.week.gateway.domain.login;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginPostDto {
    private String userId;
    private String password;
}
