package com.example.Veterinaria.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nico Morales
 */


@Entity
@Getter @Setter
public class Duenio {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private int dni;
    private String nombre;
    private String apellido;
    private int celular;
    
    @OneToMany(orphanRemoval = true)
    private List <Mascota> mascotas;

    public Duenio() {
    }

    public Duenio(Long id, int dni, String nombre, String apellido, int celular) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

}