package com.apipaises.remaster.service;

import com.apipaises.remaster.models.pais.Pais;
import com.apipaises.remaster.models.pais.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceIMP implements PaisService {

    @Autowired
    private PaisRepository paisRepository;
    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }
}
