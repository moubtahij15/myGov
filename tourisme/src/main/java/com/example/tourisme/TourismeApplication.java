package com.example.tourisme;

import com.example.tourisme.entities.Departement;
import com.example.tourisme.helpers.Minister;
import com.example.tourisme.repository.DepartementRepo;
import com.example.tourisme.repository.TransactionRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class TourismeApplication {

    public static void main(String[] args) {

        SpringApplication.run(TourismeApplication.class, args);
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
