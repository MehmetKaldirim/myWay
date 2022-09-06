package com.zerotohero;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class MyWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWayApplication.class, args);
    }


    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
