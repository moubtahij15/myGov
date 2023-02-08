package com.example.financeserviceelasticsearch.repository;

import com.example.financeserviceelasticsearch.documents.Employé;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeRepo extends ElasticsearchRepository<Employé,String> {
}
