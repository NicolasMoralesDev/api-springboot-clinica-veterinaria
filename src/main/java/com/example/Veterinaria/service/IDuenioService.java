
package com.example.Veterinaria.service;

import com.example.Veterinaria.model.Duenio;
import com.example.Veterinaria.model.Mascota;
import java.util.List;

/**
 *
 * @author Nico Morales
 */
public interface IDuenioService {
    
    public List traerDuenios ();
    public Duenio traerDuenioId(long id);
    public void borrarDuenio(long id);
    public void editaruenio(Duenio modif);
    public void crearDuenio(Duenio nuevo);
}
