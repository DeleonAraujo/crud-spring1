package com.deleon.crudspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data       //anotação que gera getter e setter automaticamente
@Entity
public class Curso {
    
    @Id     //anotação que indica chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)     //anotação que indica que a chave será gerada de modo automatico pela aplicação
    private Long id;

    @Column(length = 200, nullable = false)     //coluna com 200 caracteres e preenchimento obrigatório
    private String nome;

    @Column(length = 30, nullable = false)     //coluna com 30 caracteres e preenchimento obrigatório
    private String categoria;
    
}
