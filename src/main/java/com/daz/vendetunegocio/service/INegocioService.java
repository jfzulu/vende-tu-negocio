package com.daz.vendetunegocio.service;

import java.util.List;

import com.daz.vendetunegocio.model.Negocio;

public interface INegocioService {

    void save(Negocio negocio);

    List<Negocio> listAll();

    void deleteById(Long id);

    Negocio getById(Long id);

}
