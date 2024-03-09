package com.nhnacademy.week.gateway.entity.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum ProjectStatusCode {
    ACTIVE("활성"), INACTIVE("휴면"), SHUTDOWN("종료");
    private String value;
}
