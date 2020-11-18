/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.service;

import com.manager.viveros.model.Vivero;
import com.manager.viveros.repository.ViveroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfar
 */
@Service
public class ViveroServiceImp implements ViveroService{
    
    @Autowired
    private ViveroRepository repository; 

    @Override
    public List<Vivero> Listar() {
        return repository.findAll();
    }

    @Override
    public Vivero listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Vivero add(Vivero v) {
        return repository.save(v);
    }

    @Override
    public Vivero edit(Vivero v) {
        return repository.save(v);
    }

    @Override
    public Vivero delete(int id) {
        Vivero v = repository.findById(id);
        if (v != null){
            repository.delete(v);
        }
        return v;
    }
    
}
