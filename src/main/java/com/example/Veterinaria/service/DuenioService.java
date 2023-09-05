
package com.example.Veterinaria.service;

import com.example.Veterinaria.model.Duenio;
import com.example.Veterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico Morales
 */

@Service
public class DuenioService implements IDuenioService{
    
    @Autowired
    private IDuenioRepository duenioRepo;

    @Override
    public List traerDuenios() {
        
       return duenioRepo.findAll();
    }

    @Override
    public Duenio traerDuenioId(long id) {

        return duenioRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarDuenio(long id) {

        duenioRepo.deleteById(id);
    }

    @Override
    public void editaruenio(Duenio modif) {
        duenioRepo.save(modif);
    }

    @Override
    public void crearDuenio(Duenio nuevo) {
    
       duenioRepo.save(nuevo);
        
    }
    
}
