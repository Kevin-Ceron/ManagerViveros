/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.service;


import com.manager.viveros.model.Productor;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface ProductorService {
    List<Productor>Listar();
    Productor listarId(int id);
    Productor add(Productor P);
    Productor edit(Productor P);
    Productor delete(int id);
    
    
}
