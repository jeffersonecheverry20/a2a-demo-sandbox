package com.example.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola-mundo")
class HolaMundoController {
    @GetMapping()
    public String helloWorld() {
        return "Hola Mundo";
    }
}