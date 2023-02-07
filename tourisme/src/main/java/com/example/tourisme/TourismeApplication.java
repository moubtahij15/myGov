package com.example.tourisme;

import com.example.tourisme.entities.Departement;
import com.example.tourisme.entities.Minister;
import com.example.tourisme.repository.DepartementRepo;
import com.example.tourisme.repository.MinisterRepo;
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
    CommandLineRunner start(MinisterRepo ministerRepo, DepartementRepo departementRepo, TransactionRepo transactionRepo) {
        return args -> {
            Minister minister=Minister.builder().nom("Minister du tourisme").build();

            System.out.println(minister);

            ministerRepo.save(minister);
            System.out.println(minister.getId());

            departementRepo.saveAll(
                    List.of(
                            Departement.builder().nom("RH").minister_id(minister.getId()).build(),
                            Departement.builder().nom("Comptabilité").minister_id(minister.getId()).build()

                    )
                    );


        };
    }

}
