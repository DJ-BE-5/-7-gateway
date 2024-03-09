package com.nhnacademy.week.gateway.entity.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String userId;
    private String userPassword;
    private String userEmail;
    private Integer userAdmin;
    private UserStatusCode userStatusCode;
}
