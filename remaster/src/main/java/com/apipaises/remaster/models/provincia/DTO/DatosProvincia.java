package com.apipaises.remaster.models.provincia.DTO;

import com.apipaises.remaster.models.provincia.Provincia;

public record DatosProvincia (String nombre){

    public DatosProvincia(Provincia provincia){
        this(provincia.getNombre());
    }
}
