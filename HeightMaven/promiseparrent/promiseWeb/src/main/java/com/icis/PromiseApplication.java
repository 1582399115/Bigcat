package com.icis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//启动类
@MapperScan("com.icis.mapper")
@SpringBootApplication
public class PromiseApplication {
    public static void main(String[] args) {
        SpringApplication.run(PromiseApplication.class,args);
    }
}
