package com.zerotohero.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Data
@NoArgsConstructor
public class Role {

    private Long id;
    private String description;
    private Boolean enabled;
    private Integer salary;




}
