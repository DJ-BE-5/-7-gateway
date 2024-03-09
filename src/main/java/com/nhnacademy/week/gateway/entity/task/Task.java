package com.nhnacademy.week.gateway.entity.task;

import com.nhnacademy.week.gateway.entity.project.Project;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private Long taskId;
    private String taskComment;
    private Project project;
    private String userId;
}
