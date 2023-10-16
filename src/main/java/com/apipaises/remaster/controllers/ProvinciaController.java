package com.apipaises.remaster.controllers;

import com.apipaises.remaster.models.provincia.DTO.DatosProvincia;
import com.apipaises.remaster.models.provincia.DTO.DatosProvinciaAndPais;
import com.apipaises.remaster.models.provincia.Provincia;
import com.apipaises.remaster.models.provincia.ProvinciaRepository;
import com.apipaises.remaster.service.ProvinciaServiceIMP;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController {

    @Autowired
    private ProvinciaServiceIMP provinciaServiceIMP;

    @GetMapping("/{pais_nombre}")
    @Transactional
    public ResponseEntity<List<DatosProvincia>> ListadoProvinciaPorPais(@PathVariable String pais_nombre){
        List<Provincia> request = provinciaServiceIMP
                .findAll()
                .stream()
                .filter(prov -> prov.getPais().getNombre().equals(pais_nombre))
                .toList();

        return ResponseEntity.ok(request.stream().map(DatosProvincia::new).toList());
    }

    @GetMapping("/all")
    public ResponseEntity<List<DatosProvinciaAndPais>> listadoTodasLasProvincias(){
        return ResponseEntity.ok(provinciaServiceIMP.findAll().stream().map(DatosProvinciaAndPais::new).toList());
    }
}
