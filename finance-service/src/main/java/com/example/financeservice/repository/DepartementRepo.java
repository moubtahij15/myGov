package com.example.financeservice.repository;

import com.example.financeservice.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartementRepo extends JpaRepository<Departement,String> {
}
