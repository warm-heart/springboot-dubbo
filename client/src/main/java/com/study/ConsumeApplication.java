package com.study;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class ConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumeApplication.class, args);
    }
}
