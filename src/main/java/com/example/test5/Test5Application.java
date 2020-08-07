package com.example.test5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test5.mapper")
public class Test5Application {

    public static void main(String[] args) {
        SpringApplication.run(Test5Application.class, args);
    }

}
