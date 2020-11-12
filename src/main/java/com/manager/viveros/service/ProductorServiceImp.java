/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.service;

import com.manager.viveros.model.Productor;
import com.manager.viveros.repository.ProductorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class ProductorServiceImp implements ProductorService {
    
    @Autowired
    private ProductorRepository repository;

    @Override
    public List<Productor> Listar() {
        return repository.findAll(); 
    }

    @Override
    public Productor listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Productor add(Productor P) {
        return repository.save(P);
    }

    @Override
    public Productor edit(Productor P) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Productor delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
