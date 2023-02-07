package com.example.tourisme.repository;

import com.example.tourisme.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface DepartementRepo extends JpaRepository<Departement, String> {

    Departement findDepartementById (String id);
}
