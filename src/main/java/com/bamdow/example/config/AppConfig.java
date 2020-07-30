package com.bamdow.example.config;

import com.bamdow.example.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther Sam Li
 * @Date 2020-07-31
 */
@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car car() {
        Car car = new Car();
        car.setId("A01");
        return car;
    }

}
