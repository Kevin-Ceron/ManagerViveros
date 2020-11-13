/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.controller;

import com.manager.viveros.model.Productor;
import com.manager.viveros.service.ProductorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Lenovo
 */
@RestController
@RequestMapping({"/productores"})
public class ProductorController {
    
    @Autowired
    ProductorService service;
    
    @GetMapping("/listar")
    public List<Productor>listar(){
        return service.Listar();
    }
    
    @PostMapping("/agregar")
    public Productor agregar(@RequestBody Productor P){
        return service.add(P);
    }
    
    @GetMapping("/listarid")
    public Productor listarid(@RequestHeader int id){
        return service.listarId(id);
    }
    
    @DeleteMapping("/delete")
    public Productor borrar(@RequestHeader int id){
        return service.delete(id);
    }
            
    
}
