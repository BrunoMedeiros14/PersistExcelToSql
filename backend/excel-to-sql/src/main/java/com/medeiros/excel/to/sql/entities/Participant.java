package com.medeiros.excel.to.sql.entities;

import com.medeiros.excel.to.sql.dto.ParticipantDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_participants")
public class Participant {

    @Id
    @Setter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private Integer identification;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private Double average;

    public Participant(ParticipantDTO participantDTO) {
        identification = participantDTO.getIdentification();
        name = participantDTO.getName();
        age = participantDTO.getAge();
        average = participantDTO.getAverage();
    }

}
