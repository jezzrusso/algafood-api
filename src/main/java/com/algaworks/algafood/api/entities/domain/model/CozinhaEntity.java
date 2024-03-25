package com.algaworks.algafood.api.entities.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cozinha")
@Data
public class CozinhaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;



}
