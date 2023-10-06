package com.apipaises.remaster.controllers;

import com.apipaises.remaster.models.pais.DTO.DatosPais;
import com.apipaises.remaster.models.pais.DTO.DatosPaisUniq;
import com.apipaises.remaster.models.pais.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    PaisRepository paisRepository;

    @GetMapping("/all")
    public ResponseEntity<List<DatosPais>> listadoTodosLosPaises(){
        return ResponseEntity.ok(paisRepository.findAll().stream().map(DatosPais::new).toList());
    }
}
