package com.deleon.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deleon.crudspring.model.Curso;
import com.deleon.crudspring.repository.CursoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor     //gera o construtor
public class CursosController {

    private final CursoRepository cursoRepository;


    @GetMapping
    public List<Curso> list(){
        return cursoRepository.findAll();
    }

}
