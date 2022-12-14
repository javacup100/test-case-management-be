package com.shopee.tcm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.shopee.tcm.dao"})
public class TcmApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcmApplication.class, args);
    }

}
