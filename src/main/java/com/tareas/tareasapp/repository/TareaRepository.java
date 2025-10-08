package com.tareas.tareasapp.repository;

import com.tareas.tareasapp.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {}
