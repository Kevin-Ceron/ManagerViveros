/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.viveros.repository;

import com.manager.viveros.model.Vivero;
import java.util.List;
import org.springframework.data.repository.Repository;
/**
 *
 * @author alfar
 */
public interface ViveroRepository extends Repository<Vivero, Integer>{
    
    List<Vivero>findAll();
    Vivero findById(int id);
    Vivero save (Vivero v);
    void delete (Vivero v);
    
}
