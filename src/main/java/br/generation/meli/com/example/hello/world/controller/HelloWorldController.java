package br.generation.meli.com.example.hello.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {

        return "Olá Mundo !!";
    }

    @GetMapping("/bsm-generation")
    public String bsmGeneration() {

        return "Lista de BSM’s da Generation Brasil\n" +
                "* Mentalidade de crescimento \n" +
                "* Persistência \n" +
                "* Responsabilidade pessoal \n" +
                "* Orientação ao futuro\n" +
                "* Comunicação \n" +
                "* Orientação ao detalhes \n" +
                "* Proatividade\n";
    }

    @GetMapping("/objetivos-aprendizagem")
    public String objetivosAprendizagem() {

        return "Objativo dessa semana continuar estudando:\n" +
                "* Java" +
                "* banco de dados " +
                "* MySQL " +
                "* Spring Boot " +
                "* JPA,";
    }
}
