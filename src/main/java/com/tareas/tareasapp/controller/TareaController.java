package com.tareas.tareasapp.controller;

import com.tareas.tareasapp.model.Tarea;
import com.tareas.tareasapp.repository.TareaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
    private final TareaRepository repo;
    public TareaController(TareaRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Tarea> listar() { return repo.findAll(); }

    @PostMapping
    public Tarea guardar(@RequestBody Tarea t) { return repo.save(t); }
}
