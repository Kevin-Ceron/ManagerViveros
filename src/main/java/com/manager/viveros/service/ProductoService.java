/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.service;

import com.manager.viveros.model.Producto;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface ProductoService {
    
    List<Producto>Listar();
    Producto listarId(int id);
    Producto add(Producto p);
    Producto edit(Producto p);
    Producto delete(int id);
    
}
