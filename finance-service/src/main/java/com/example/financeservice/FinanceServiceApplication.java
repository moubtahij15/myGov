package com.example.financeservice;

import com.example.financeservice.entities.Departement;
import com.example.financeservice.helpers.Minister;
import com.example.financeservice.repository.DepartementRepo;
import com.example.financeservice.repository.TransactionRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FinanceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(DepartementRepo departementRepo, TransactionRepo transactionRepo) {
        return args -> {
            departementRepo.saveAll(
                    List.of(
                            Departement.builder().nom("Rh").minister(Minister.MINISTER).build(),
                            Departement.builder().nom("Comptabilité").minister(Minister.MINISTER).build()

                    )
            );


        };
    }
}
