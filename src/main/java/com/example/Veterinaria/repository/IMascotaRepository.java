
package com.example.Veterinaria.repository;

import com.example.Veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nico Morales
 */

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    
}
