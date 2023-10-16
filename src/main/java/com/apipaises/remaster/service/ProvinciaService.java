package com.apipaises.remaster.service;

import com.apipaises.remaster.models.provincia.Provincia;
import com.apipaises.remaster.models.provincia.ProvinciaRepository;

import java.util.List;

public interface ProvinciaService {

    List<Provincia> findAll();
}
