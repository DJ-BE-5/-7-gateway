package com.nhnacademy.week.gateway.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotBlank;

@Data
@ConfigurationProperties(prefix = "com.nhnacademy.task")
public class TaskProperties {
    @NotBlank
    private String address;
}
