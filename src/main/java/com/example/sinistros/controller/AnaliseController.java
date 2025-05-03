package com.example.sinistros.controller;

import com.example.sinistros.messaging.RabbitMQProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/analises")
public class AnaliseController {

    @Autowired
    private RabbitMQProducerService rabbitMQProducerService;

    @GetMapping
    public String mostrarAnalises() {
        return "analises";
    }

    @PostMapping("/enviar")
    public String enviarParaRabbit(@RequestParam("idFoto") String idFoto) {
        rabbitMQProducerService.enviarAnalise(idFoto);
        return "redirect:/analises";
    }
}
