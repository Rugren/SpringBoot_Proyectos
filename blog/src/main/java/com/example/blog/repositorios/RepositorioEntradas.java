package com.example.blog.repositorios;

import com.example.blog.modelo.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RepositorioEntradas extends JpaRepository<Entrada, Long> {
    public ArrayList<Entrada> findAll();
    public Entrada save(Entrada entrada);
    public Entrada findById(long id);
}
