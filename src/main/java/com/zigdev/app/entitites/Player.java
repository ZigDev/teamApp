package com.zigdev.app.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String position;
    private String number;
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn
    private Team team;
}
