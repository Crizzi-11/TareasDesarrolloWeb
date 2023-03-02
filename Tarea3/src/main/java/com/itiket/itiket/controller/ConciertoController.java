
package com.itiket.itiket.controller;


import com.itiket.itiket.entity.Pais;
import com.itiket.itiket.entity.Concierto;
import com.itiket.itiket.service.IPaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.itiket.itiket.service.IConciertoService;

/**
 *
 * @author Cristofer
 */

@Controller
public class ConciertoController {
    
    @Autowired
    private IConciertoService ConciertoService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/concierto")
    public String index(Model model){
        List<Concierto> listaConcierto = ConciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Concierto");
        model.addAttribute("conciertos", listaConcierto);
        return "conciertos";
    }
    
    @GetMapping("/conciertoN")
    public String crearConcierto(Model model){
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("conciertos", new Concierto());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
    
}
