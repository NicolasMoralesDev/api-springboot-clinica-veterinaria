
package com.example.Veterinaria.controller;

import com.example.Veterinaria.model.Mascota;
import com.example.Veterinaria.model.Message;
import com.example.Veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nico Morales
 */

@RestController
@RequestMapping("/mascota")
public class MascotaController {
    
    @Autowired
    private MascotaService mascoServ;
    
    
    @GetMapping("/traer")
    @ResponseBody
    public ResponseEntity traerMascotas(){
        
        return new ResponseEntity(mascoServ.traerMascotas(), HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/traer/caniches")
    @ResponseBody
    public ResponseEntity traerMascotasCaniches(){
        
        return new ResponseEntity(mascoServ.traerMascotaPerro(), HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/traer/{id}")
    @ResponseBody
    public ResponseEntity traerMascota(@PathVariable long id){
        
        return new ResponseEntity(mascoServ.traerMascotaId(id), HttpStatus.ACCEPTED);
    }
    
    @DeleteMapping("/borrar/{id}")
    @ResponseBody
    public ResponseEntity borrarMascotas(@PathVariable Long id){
        
        
        return new ResponseEntity( mascoServ.borrarMascota(id), HttpStatus.ACCEPTED);
    }
    
    @PostMapping("/crear")
    @ResponseBody
    public ResponseEntity postMascota(@RequestBody Mascota nueva ){
        
        mascoServ.crearMascota(nueva);
        
        return new ResponseEntity( new Message("Mascota creada con exito!"), HttpStatus.ACCEPTED);
    }
    
    @PutMapping("/modificar")
    @ResponseBody
    public ResponseEntity putMascota(@RequestBody Mascota modif ){
        
        mascoServ.modifMascota(modif);
        
        return new ResponseEntity( new Message("Mascota modificada con exito!"), HttpStatus.ACCEPTED);
    }
}
