/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.controller;

import com.manager.viveros.model.Producto;
import com.manager.viveros.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author ferna
 */
@RestController
@RequestMapping({"/productos"})
public class ProductoController {
    
    @Autowired
    ProductoService service;
    
    @GetMapping("/listar")
    public List<Producto>listar(){
        return service.Listar();
    }
    
    @PostMapping("/agregar")
    public Producto agregar(@RequestBody Producto p){
        return service.add(p);
    }
    
    @GetMapping("/listarid")
    public Producto listarid(@RequestHeader int id){
        return service.listarId(id);
    }
    
    @DeleteMapping("/delete")
    public Producto borrar(@RequestHeader int id){
        return service.delete(id);
    }
}

