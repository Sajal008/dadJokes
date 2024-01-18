package com.example.dadjokes;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DadJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DadJokesApplication.class, args);


    }

    public class DadJokes
    {

    }

}
