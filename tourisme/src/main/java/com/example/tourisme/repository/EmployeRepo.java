package com.example.tourisme.repository;

import com.example.tourisme.entities.Employé;
import com.example.tourisme.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeRepo extends JpaRepository<Employé,String> {

}
