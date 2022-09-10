package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
import com.zerotohero.entity.Program;
import com.zerotohero.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private Boolean enabled;
    //private String password;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "r_id" ) //reference to the role_id
    private Role role;


    @ManyToMany
    @JoinTable(name = "user_program_rel",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "program_id"))
    private Set<Program> programList;



    @Override
    public String toString() {
        return "User{" +
                "createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", userStatus=" + userStatus +
                '}';
    }
}
