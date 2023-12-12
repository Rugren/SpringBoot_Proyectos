package com.example.blog.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    @Column(columnDefinition = "TEXT")
    private String contenido;
}
