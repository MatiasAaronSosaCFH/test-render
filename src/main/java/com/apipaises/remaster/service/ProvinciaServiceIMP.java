package com.apipaises.remaster.service;

import com.apipaises.remaster.models.provincia.Provincia;
import com.apipaises.remaster.models.provincia.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceIMP implements ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;
    @Override
    public List<Provincia> findAll() {
        return provinciaRepository.findAll();
    }
}
