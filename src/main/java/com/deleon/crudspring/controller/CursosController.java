package com.deleon.crudspring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Curso create(@RequestBody Curso record) {
        return cursoRepository.save(record);
    }

}
