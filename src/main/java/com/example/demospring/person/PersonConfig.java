package com.example.demospring.person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository){
        return args -> {
            Person alex = new Person(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1990,2,12)
            );
           Person john = new Person(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(1985, Month.JULY,22)
            );
           repository.saveAll(List.of(alex,john));
        };
    }
}
