package com.nhnacademy.week.gateway.domain.users;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserAccountSignUpRequestDto {
    private String userId;
    private String userPassword;
    private String userEmail;
}
