package com.example.primerspring.modelo;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="productos")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String nombre;
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    private double precio;
    private String imagen;
}
