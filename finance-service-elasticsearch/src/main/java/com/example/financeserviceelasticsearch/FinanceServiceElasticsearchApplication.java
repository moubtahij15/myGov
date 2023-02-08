package com.example.financeserviceelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FinanceServiceElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceServiceElasticsearchApplication.class, args);
    }

}
