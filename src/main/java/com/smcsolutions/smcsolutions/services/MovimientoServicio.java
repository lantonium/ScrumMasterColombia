package com.smcsolutions.smcsolutions.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.smcsolutions.smcsolutions.modelo.MovimientoModelo;
import com.smcsolutions.smcsolutions.repositorios.MovimientoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovimientoServicio {
    
    @Autowired
    MovimientoRepositorio movimientoRepositorio;

    public ArrayList<MovimientoModelo> obtenerMovimientos(){
        return (ArrayList<MovimientoModelo>) movimientoRepositorio.findAll();
    }

    public MovimientoModelo guardarMovimiento(MovimientoModelo movimientoDinero){
        return movimientoRepositorio.save(movimientoDinero);
    }

    public void eliminarMovimiento(Long id){
        movimientoRepositorio.deleteById(id);
    }

    public Optional<MovimientoModelo> obtenerPorId(Long id) {
        return movimientoRepositorio.findById(id);
    }

    public List<MovimientoModelo> MovimientoModeloList() {
        return null;
    }
}