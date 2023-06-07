package com.medeiros.excel.to.sql.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantDTO {
    private Integer identification;
    private String name;
    private Integer age;
    private Double average;
}
