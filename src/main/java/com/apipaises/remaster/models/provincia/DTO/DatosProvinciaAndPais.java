package com.apipaises.remaster.models.provincia.DTO;

import com.apipaises.remaster.models.provincia.Provincia;

public record DatosProvinciaAndPais (String nombre,
                                     String pais){

    public DatosProvinciaAndPais(Provincia provincia){
        this(provincia.getNombre(), provincia.getPais().getNombre());
    }
}
