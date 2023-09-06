
package com.example.Veterinaria.repository;

import com.example.Veterinaria.model.Duenio;
import com.example.Veterinaria.model.Mascota;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nico Morales
 */

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    
     @Query("SELECT m FROM Mascota m WHERE m.raza = 'caniche' AND m.especie = 'perro'")
    List findByRazaAndEspecie();
}
