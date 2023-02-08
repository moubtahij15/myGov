package com.example.financeserviceelasticsearch.repository;

import com.example.financeserviceelasticsearch.documents.Transaction;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepo extends ElasticsearchRepository<Transaction,String> {
}
