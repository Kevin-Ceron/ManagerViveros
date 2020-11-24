/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.service;

import com.manager.viveros.model.Producto;
import com.manager.viveros.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author ferna
 */
@Service
public class ProductoServiceImp implements ProductoService {
    
    @Autowired
    private ProductoRepository repository;

    @Override
    public List<Producto> Listar() {
        return repository.findAll();
    }

    @Override
    public Producto listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return repository.save(p);
    }

    @Override
    public Producto edit(Producto p) {
        return repository.save(p);
    }

    @Override
    public Producto delete(int id) {
        Producto p = repository.findById(id);
        if(p != null)
            repository.delete(p);
        return p;
    }
    
    
    
            
            
}
