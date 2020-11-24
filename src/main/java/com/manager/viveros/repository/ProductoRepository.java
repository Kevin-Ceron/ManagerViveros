/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.repository;

import com.manager.viveros.model.Producto;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author ferna
 */
public interface ProductoRepository extends Repository<Producto, Integer>{
    List<Producto>findAll();
    Producto findById(int id);
    Producto save (Producto p);
    void delete (Producto p);
           
}
