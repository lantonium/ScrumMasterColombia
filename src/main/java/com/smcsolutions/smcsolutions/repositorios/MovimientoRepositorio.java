package com.smcsolutions.smcsolutions.repositorios;

import com.smcsolutions.smcsolutions.modelo.MovimientoModelo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepositorio extends CrudRepository<MovimientoModelo, Long> {
    public abstract ArrayList<MovimientoModelo> findAllByEmpresa(String empresa);



}

