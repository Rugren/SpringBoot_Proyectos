package com.example.primerspring.controladores;

import com.example.primerspring.modelo.Producto;
import com.example.primerspring.repositorios.RepositorioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class Principal {
    @Autowired
    RepositorioProductos repositorioProductos;

    @GetMapping("/")
    public String primerapagina(Model model){
        model.addAttribute("usuario", "Antonio");
        model.addAttribute("mes", "octubre");
        return "index";
    }

    @GetMapping("/ubicacion")
    public String ubicacion(Model model){
        return "ubicacion";
    }

    @GetMapping("/privacidad")
    public String privacidad(Model model){
        return "privacidad";
    }

    @GetMapping("/tienda")
    public String tienda(Model model){
        ArrayList<Producto> lista=repositorioProductos.findAll();
        model.addAttribute("lista", lista);

        return "tienda";
    }

}