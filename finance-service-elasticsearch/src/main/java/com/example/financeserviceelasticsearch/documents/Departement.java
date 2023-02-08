package com.example.financeserviceelasticsearch.documents;

import com.example.financeserviceelasticsearch.helpers.Minister;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Collection;

@Document(indexName = "departement")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nom;

    private String minister= Minister.MINISTER;

    private Collection<Employé> employés;


}
