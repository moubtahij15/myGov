package com.example.financeservice.repository;

import com.example.financeservice.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepo extends JpaRepository<Transaction,String> {
}
