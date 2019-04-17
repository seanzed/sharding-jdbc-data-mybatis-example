package com.sharding.jdbc.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ShardingJdbcDataMybatisExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcDataMybatisExampleApplication.class, args);
    }
}
