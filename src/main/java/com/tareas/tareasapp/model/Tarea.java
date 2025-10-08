package com.tareas.tareasapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
}
