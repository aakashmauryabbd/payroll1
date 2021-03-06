package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Slf4j
class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository){
        return args -> {
            log.info("Preloading" + employeeRepository.save(new Employee("Bilbo","Baggins", "Burglar")));
            log.info("Preloading" + employeeRepository.save(new Employee("Frodo","Baggins", "Thief")));

        };
    }
}
