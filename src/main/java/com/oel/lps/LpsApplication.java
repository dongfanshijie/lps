package com.oel.lps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan("com.oel.lps.mapper")
@EntityScan("com.oel.lps.bean")
public class LpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LpsApplication.class, args);
    }

}
