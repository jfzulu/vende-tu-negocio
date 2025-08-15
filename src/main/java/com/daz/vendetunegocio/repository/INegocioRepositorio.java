package com.daz.vendetunegocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daz.vendetunegocio.model.Negocio;

public interface INegocioRepositorio extends JpaRepository<Negocio, Long> {

    // Aquí puedes agregar métodos personalizados si es necesario

}
