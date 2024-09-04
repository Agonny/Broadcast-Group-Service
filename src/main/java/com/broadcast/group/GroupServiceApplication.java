package com.broadcast.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class GroupServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroupServiceApplication.class, args);
    }

}
