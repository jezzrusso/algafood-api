package com.algaworks.algafood.api.entities.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cozinha")
@Data
public class CozinhaEntity {

    @Id
    private Long id;

    private String nome;



}
