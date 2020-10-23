/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Vivero;
import service.ViveroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alfar
 */

@RestController
public class Controlador {
    
    @Autowired
    ViveroService service_v;
    
    @GetMapping("/listar_v")
    public List<Vivero> listar_v(){
        return service_v.Listar();
    }
    
}
