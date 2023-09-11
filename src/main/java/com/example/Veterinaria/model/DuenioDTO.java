
package com.example.Veterinaria.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nico Morales
 */
@Getter
@Setter
public class DuenioDTO {
    
      final String nombre_mascota;
      final String especie;
      final String raza;
      final String nombre_duenio;
      final String apellido_duenio;

    public DuenioDTO(String nombre_mascota, String especie, String raza, String nombre_duenio, String apellido_duenio) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenio = nombre_duenio;
        this.apellido_duenio = apellido_duenio;
    }


    
    
}
