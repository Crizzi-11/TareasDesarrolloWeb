
package com.Itiket.Itiket.controller;



import com.Itiket.Itiket.entity.Concierto;
import com.Itiket.Itiket.entity.Pais;

import com.Itiket.Itiket.service.IPaisService;
import com.Itiket.Itiket.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Cristofer
 */

@Controller
public class ConciertoController {
    
    @Autowired
    private IConciertoService conciertoService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/concierto")
    public String index(Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
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
    
    
     @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id") Long idConcierto){
        conciertoService.delete(idConcierto);
        return  "redirect:/concierto";
    }
    
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Concierto concierto){
    conciertoService.saveConcierto(concierto);
    return "redirect:/concierto";
    }
    
    @GetMapping("/editConcierto/{id}")
    public String editarConcierto(@PathVariable("id") Long idConcierto, Model model){
    Concierto concierto = conciertoService.getConciertoById(idConcierto);
    List<Pais> listaPaises = paisService.listCountry();
    model.addAttribute("conciertos", concierto);
    model.addAttribute("paises", listaPaises);
    return  "crear";
    }
    
    
    
    
    
    
    
    
    
    
}
