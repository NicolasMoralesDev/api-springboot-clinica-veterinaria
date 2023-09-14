
package com.example.Veterinaria.service;

import com.example.Veterinaria.Exepcion.MiExepcion;
import com.example.Veterinaria.model.Duenio;
import com.example.Veterinaria.model.Mascota;
import com.example.Veterinaria.model.Message;
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
    public Message  borrarDuenio(long id){

        try {
            duenioRepo.deleteById(id);
        } catch (Exception e) {
            return  new Message("No existe ningun duenio con ese ID!");
        }
   
          return new Message("Duenio borrado correctamente!");
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
