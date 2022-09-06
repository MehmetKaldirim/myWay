package com.zerotohero.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="roles")
public class Role {

    private String description;
    private Boolean enabled;
    private Integer salary;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // will generate the data/id numbers automatically
    private Long id;



}
