package com.apipaises.remaster.models.provincia;

import com.apipaises.remaster.models.pais.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinciaRepository extends JpaRepository<Provincia,Long> {

    List<Provincia> findByPaisId(Long pais_id);
}
