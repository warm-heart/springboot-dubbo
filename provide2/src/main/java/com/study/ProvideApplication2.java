package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class ProvideApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication2.class, args);
    }
}
