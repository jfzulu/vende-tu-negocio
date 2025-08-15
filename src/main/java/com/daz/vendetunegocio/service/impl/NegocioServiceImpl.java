package com.daz.vendetunegocio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daz.vendetunegocio.model.Negocio;
import com.daz.vendetunegocio.repository.INegocioRepositorio;
import com.daz.vendetunegocio.service.INegocioService;

@Service
public class NegocioServiceImpl implements INegocioService {

    @Autowired
    private INegocioRepositorio negocioRepositorio;

    @Override
    public void save(Negocio negocio) {
        negocioRepositorio.save(negocio);
    }

    @Override
    public List<Negocio> listAll() {
        return negocioRepositorio.findAll();
    }

    @Override
    public void deleteById(Long id) {
        negocioRepositorio.deleteById(id);
    }

    @Override
    public Negocio getById(Long id) {
        return negocioRepositorio.findById(id).get();
    }

}
