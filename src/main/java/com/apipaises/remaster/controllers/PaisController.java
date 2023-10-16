package com.apipaises.remaster.controllers;

import com.apipaises.remaster.models.pais.DTO.DatosPais;
import com.apipaises.remaster.models.pais.Pais;
import com.apipaises.remaster.models.pais.PaisRepository;
import com.apipaises.remaster.service.PaisServiceIMP;
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
    PaisRepository paisServiceIMP;

    @GetMapping("/all")
    public ResponseEntity<List<DatosPais>> listadoTodosLosPaises(){

            return ResponseEntity.ok(paisServiceIMP.findAll().stream().map(DatosPais::new).toList());


    }
}
