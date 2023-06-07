package com.medeiros.excel.to.sql.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_participants")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Participant {

    @Id
    @Setter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Integer identification;
    private String name;
    private Integer age;
    private Double average;

}
