package com.zerotohero.entity;

import com.zerotohero.enums.UserStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="users")
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private Boolean enabled;
    private String password;
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
                ", password='" + password + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
