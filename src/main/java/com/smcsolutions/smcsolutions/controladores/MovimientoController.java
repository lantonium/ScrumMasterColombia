package com.smcsolutions.smcsolutions.controladores;

import java.util.ArrayList;

import com.smcsolutions.smcsolutions.modelo.MovimientoModelo;
import com.smcsolutions.smcsolutions.services.MovimientoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/movimiento")
public class MovimientoController {
    
    @Autowired
    MovimientoServicio movimientoServicio;

    @GetMapping("/obtener")
    public ArrayList<MovimientoModelo> obtenerMovimientos(){
        return movimientoServicio.obtenerMovimientos();
    }
    
    @PostMapping("/guardar")
    public MovimientoModelo guardarMovimiento(@RequestBody MovimientoModelo movimientoDinero){
        return this.movimientoServicio.guardarMovimiento(movimientoDinero);
    }

    @PatchMapping("/actualizar")
    public MovimientoModelo actualizarMovimiento(@RequestBody MovimientoModelo movimientoDinero){
        return this.movimientoServicio.guardarMovimiento(movimientoDinero);
    }

    @DeleteMapping("/eliminar/{id}")
    private String eliminarMovimiento(@PathVariable("id") Long id){
        this.movimientoServicio.eliminarMovimiento(id);
        return "redirect:/crud";
    }
}