
package com.example.Veterinaria.service;

import com.example.Veterinaria.model.Mascota;
import com.example.Veterinaria.model.Message;
import java.util.List;

/**
 *
 * @author Nico Morales
 */
public interface IMascotaService {
    
    
    public List traerMascotas();
    public Mascota traerMascotaId(Long id);
    public Message borrarMascota(long id);
    public void crearMascota(Mascota nueva);
    public void modifMascota(Mascota modificada);}
