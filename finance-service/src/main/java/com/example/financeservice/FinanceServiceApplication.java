package com.example.financeservice;

import com.example.financeservice.entities.Departement;
import com.example.financeservice.entities.Minister;
import com.example.financeservice.repository.DepartementRepo;
import com.example.financeservice.repository.MinisterRepo;
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
    CommandLineRunner start(MinisterRepo ministerRepo, DepartementRepo departementRepo, TransactionRepo transactionRepo) {
        return args -> {
            Minister minister = Minister.builder().nom("Minister du Finance").build();

            System.out.println(minister);

            ministerRepo.save(minister);
            System.out.println(minister.getId());
            departementRepo.saveAll(
                    List.of(
                            Departement.builder().nom("Rh").minister_id(minister.getId()).build(),
                            Departement.builder().nom("Comptabilité").minister_id(minister.getId()).build()

                    )
            );


        };
    }
}
