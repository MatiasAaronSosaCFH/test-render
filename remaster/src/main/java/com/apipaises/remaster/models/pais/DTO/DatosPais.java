package com.apipaises.remaster.models.pais.DTO;

import com.apipaises.remaster.models.pais.Pais;
import com.apipaises.remaster.models.provincia.DTO.DatosProvincia;

import java.util.List;

public record DatosPais(String nombre,
                        List<DatosProvincia> provincias) {

    public DatosPais(Pais pais){
        this(pais.getNombre(), pais.getProvincias().stream().map(DatosProvincia::new).toList());
    }
}
