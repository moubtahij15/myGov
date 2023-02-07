package com.example.financeservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employé {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nom;
    private String ville;
    private double salaire;
    @Column(name = "departement_id", nullable = true)
    private String departement_id;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Departement departement;
}
