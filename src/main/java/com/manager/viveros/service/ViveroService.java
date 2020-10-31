/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.service;

import com.manager.viveros.model.Vivero;
import java.util.List;

/**
 *
 * @author alfar
 */
public interface ViveroService {
    
    List<Vivero>Listar();
    Vivero listarId(int id);
    Vivero add(Vivero v);
    Vivero edit(Vivero v);
    Vivero delete(int id);
    
}
