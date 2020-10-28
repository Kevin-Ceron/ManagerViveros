/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vivero add(Vivero v) {
        return repository.save(v);
    }

    @Override
    public Vivero edit(Vivero v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vivero delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
