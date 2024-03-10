package com.nhnacademy.week.gateway.domain.users;

import com.nhnacademy.week.gateway.entity.user.UserStatusCode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserGetAllResponseDto {
    private String userId;
    private String userEmail;
    private UserStatusCode userStatusCode;
}
