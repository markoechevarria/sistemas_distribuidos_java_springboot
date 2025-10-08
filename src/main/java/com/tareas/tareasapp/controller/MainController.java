package com.tareas.tareasapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("curso", "Sistemas Distribuidos");
        model.addAttribute("integrantes", new String[]{"Marko Echevarría Narrea", "Diego Flores Tello", "Gabriel Cuba Garcia"});
        return "index";
    }
}