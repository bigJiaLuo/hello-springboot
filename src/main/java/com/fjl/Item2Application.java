package com.fjl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fjl.mapper")
public class Item2Application {

    public static void main(String[] args) {
        SpringApplication.run(Item2Application.class, args);
    }

}
