package com.apipaises.remaster.models.pais;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaisRepository extends JpaRepository<Pais,Long> {

    @Override
    List<Pais> findAll();
}
