package com.daz.vendetunegocio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NegocioController {

    @Autowired

    @GetMapping("/negocios")
    public String listarNegocios() {
        return "negocio-vista/negocios";
    }

    @GetMapping("/negocio/nuevo")
    public String nuevoNegocio() {
        return "negocio-vista/negocio-nuevo";
    }

}
