package com.zerotohero.entity;

import com.zerotohero.enums.UserStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name="users")
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private Boolean enabled;
    //private String password;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @ManyToOne
    @JoinColumn(name = "r_id" ) //reference to the role_id
    private Role role;


    @ManyToOne
    @JoinColumn(name = "program_id" )
    private Program program;



    /*@Override
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
    }*/
}
