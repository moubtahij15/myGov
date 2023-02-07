package com.example.financeservice.repository;

import com.example.financeservice.entities.Employé;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeRepo extends JpaRepository<Employé,String> {
}
