package com.daz.vendetunegocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daz.vendetunegocio.model.Categoria;

@Repository
public interface ICategoriaRepositorio extends JpaRepository<Categoria, Long> {

    // Aquí puedes agregar métodos personalizados si es necesario

}
