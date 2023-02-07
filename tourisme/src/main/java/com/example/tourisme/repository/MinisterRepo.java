package com.example.tourisme.repository;

import com.example.tourisme.entities.Minister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MinisterRepo extends JpaRepository<Minister, String> {
}
