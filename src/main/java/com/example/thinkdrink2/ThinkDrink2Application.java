package com.example.thinkdrink2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class ThinkDrink2Application {

    public static void main(String[] args) {
        SpringApplication.run(ThinkDrink2Application.class, args);
    }

}
