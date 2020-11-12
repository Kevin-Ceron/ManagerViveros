/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.repository;

import com.manager.viveros.model.Productor;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Lenovo
 */
public interface ProductorRepository   extends Repository<Productor, Integer>{
     List<Productor>findAll();
    Productor findById(int id);
    Productor save (Productor P);
    void delete (Productor P);
}
