package com.nhnacademy.week.gateway.entity.userproject;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserProject {
    private String userId;
    private Long projectId;
    private Integer isAdmin;
}
