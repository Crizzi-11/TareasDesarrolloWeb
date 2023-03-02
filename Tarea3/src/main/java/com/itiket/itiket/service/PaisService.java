
package com.itiket.itiket.service;

import com.itiket.itiket.entity.Pais;
import com.itiket.itiket.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristofer
 */

@Service

public class PaisService implements IPaisService{
    
    @Autowired
    private PaisRepository paisRepository;
    
    @Override
    public List<Pais> listCountry() {
        return (List<Pais>)paisRepository.findAll();
    }
    
}
