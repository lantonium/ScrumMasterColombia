package com.smcsolutions.smcsolutions.controladores;

import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.smcsolutions.smcsolutions.services.MovimientoServicio;

@Controller
public class FrontControlller<MovimientoModelo> {
    
    MovimientoServicio movimientoServicio;

    public FrontControlller(MovimientoServicio movimientoServicio) {
        this.movimientoServicio = movimientoServicio;
    }

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        return "index";
    }

    @GetMapping("/crud")
    public String crud(Model nodel, Model model){
        List<com.smcsolutions.smcsolutions.modelo.MovimientoModelo> movimientos = this.movimientoServicio.MovimientoModeloList();
        model.addAttribute("movimientos", movimientos); 
        return "crud";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
