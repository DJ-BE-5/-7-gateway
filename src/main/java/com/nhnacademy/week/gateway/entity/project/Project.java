package com.nhnacademy.week.gateway.entity.project;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
public class Project {
    private Long projectId;
    private String projectName;
    private ProjectStatusCode projectStatus;
}
