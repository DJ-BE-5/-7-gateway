package com.nhnacademy.week.gateway.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotBlank;

@Data
@ConfigurationProperties(prefix = "com.nhnacademy.account")
public class AccountProperties {
    @NotBlank
    private String address;
}
