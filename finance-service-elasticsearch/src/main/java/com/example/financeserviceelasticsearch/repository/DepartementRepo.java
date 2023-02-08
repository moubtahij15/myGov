package com.example.financeserviceelasticsearch.repository;

import com.example.financeserviceelasticsearch.documents.Departement;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartementRepo extends ElasticsearchRepository<Departement, String> {
}
