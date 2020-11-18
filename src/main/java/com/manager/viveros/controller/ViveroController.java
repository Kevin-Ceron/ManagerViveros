/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.controller;

import com.manager.viveros.model.Vivero;
import com.manager.viveros.service.ViveroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author alfar
 */
@RestController
@RequestMapping({"/viveros"})
public class ViveroController {
    
    @Autowired
    ViveroService service;
    
    @GetMapping("/listar")
    public List<Vivero>listar(){
        return service.Listar();
    }
    
    @PostMapping("/agregar")
    public Vivero agregar(@RequestBody Vivero v){
        return service.add(v);
    }
    
    @GetMapping("/listarid")
    public Vivero listarid(@RequestHeader int id){
        return service.listarId(id);
    }
    
    @DeleteMapping("/delete")
    public Vivero borrar(@RequestHeader int id){
        return service.delete(id);
    }
    
}
