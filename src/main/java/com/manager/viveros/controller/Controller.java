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
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alfar
 */
@RestController
@RequestMapping({"/viveros"})
public class Controller {
    
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
