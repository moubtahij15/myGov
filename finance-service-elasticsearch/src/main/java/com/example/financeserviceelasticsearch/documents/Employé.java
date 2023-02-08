package com.example.financeserviceelasticsearch.documents;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "employé")
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

    private String departement_id;

    private Departement departement;
}
