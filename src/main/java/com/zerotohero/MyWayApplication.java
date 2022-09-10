package com.zerotohero;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWayApplication.class, args);
    }


    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }



}
