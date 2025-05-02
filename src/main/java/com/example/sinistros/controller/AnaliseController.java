// AnaliseController.java
package com.example.sinistros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnaliseController {

    @GetMapping("/analises")
    public String mostrarAnalises() {
        return "analises"; // analises.html
    }
}