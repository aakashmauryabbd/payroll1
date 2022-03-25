package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Slf4j
class LoadDB {
    @Bean
    CommandLineRunner initDB(OrderRepository orderRepository){
        return args -> {
            log.info("Preloading" + orderRepository.save(new Order("Iphone",Status.COMPLETED)));
            log.info("Preloading" + orderRepository.save(new Order("Mac", Status.CANCELLED)));

        };
    }
}

