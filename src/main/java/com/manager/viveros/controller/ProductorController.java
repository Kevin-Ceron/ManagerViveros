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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
    
    
}
