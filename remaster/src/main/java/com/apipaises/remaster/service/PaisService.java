package com.apipaises.remaster.service;

import com.apipaises.remaster.models.pais.Pais;
import com.apipaises.remaster.models.pais.PaisRepository;

import java.util.List;

public interface PaisService {

    List<Pais> findAll();
}
