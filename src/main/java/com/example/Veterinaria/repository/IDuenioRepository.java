
package com.example.Veterinaria.repository;

import com.example.Veterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nico Morales
 */

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long>{
    
    
}
