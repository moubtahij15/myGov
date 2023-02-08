package com.example.financeservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nom;


    private String minister;

    @OneToMany(mappedBy = "departement")
    private Collection<Employé> employés;


}
