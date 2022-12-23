package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
import com.zerotohero.entity.Program;
import com.zerotohero.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO  {

    private String firstName;
    private String lastName;
    private String email;
    private Boolean enabled;
    //private String password;

    private UserStatus userStatus;
    private RoleDTO role;

    private List<Program> programList;


}
