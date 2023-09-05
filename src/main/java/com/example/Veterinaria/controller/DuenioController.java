
package com.example.Veterinaria.controller;

import com.example.Veterinaria.model.Duenio;
import com.example.Veterinaria.model.Message;
import com.example.Veterinaria.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping(value = "/duenio")
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioServ;
    
    
    @GetMapping("/traer")
    @ResponseBody
    public ResponseEntity traerDuenios(){
        
      return ResponseEntity.ok( duenioServ.traerDuenios());
    }
    
    @GetMapping("/traer/{id}")
    @ResponseBody
    public ResponseEntity traerDueniosId(@PathVariable long id ){
        
        return ResponseEntity.ok(duenioServ.traerDuenioId(id));
    }
    
    @PostMapping("/crear")
    @ResponseBody
    public ResponseEntity<?> crearDuenios (@RequestBody Duenio nuevo ){
        
        duenioServ.crearDuenio(nuevo);
        return new ResponseEntity( new Message("Dueño creado con exito!"), HttpStatus.ACCEPTED);
        
    }
    
    @DeleteMapping("/borrar/{id}")
    @ResponseBody
    public ResponseEntity borrarDuenio (@PathVariable long id){
        
        duenioServ.borrarDuenio(id);
        return ResponseEntity.ok(new Message("Dueño eliminado con Exito!!"));

    }
    
//    @PutMapping("/editar/")
}
