package com.zerotohero.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class RoleDTO {

    private Long id;
    private String description;
    private Boolean enabled;
    private Integer salary;




}
