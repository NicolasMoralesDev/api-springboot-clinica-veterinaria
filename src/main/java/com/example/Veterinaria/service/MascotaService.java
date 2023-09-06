
package com.example.Veterinaria.service;

import com.example.Veterinaria.model.Mascota;
import com.example.Veterinaria.model.Message;
import com.example.Veterinaria.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico Morales
 */

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List traerMascotas() {
       
        return mascoRepo.findAll();
    }

    @Override
    public Mascota traerMascotaId(Long id) {
     
        
        return  mascoRepo.findById(id).orElse(null);
    }

    @Override
    public Message borrarMascota(long id) {
        
        try {
            mascoRepo.deleteById(id);
        } catch (Exception e) {
            return new Message(e.getMessage());
        }
      return new Message("Mascota eliminada con exito!");
    }

    @Override
    public void crearMascota(Mascota nueva) {
        
        mascoRepo.save(nueva);
    }

    @Override
    public void modifMascota(Mascota modificada) {
       
        mascoRepo.save(modificada);
    }

    @Override
    public List traerMascotaPerro() {
       
        return mascoRepo.findByRazaAndEspecie();
    }
    
}
