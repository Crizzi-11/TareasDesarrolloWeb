/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itiket.itiket.repository;
import com.itiket.itiket.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristofer
 * paisRepository
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais,Long >{
    
    
}
