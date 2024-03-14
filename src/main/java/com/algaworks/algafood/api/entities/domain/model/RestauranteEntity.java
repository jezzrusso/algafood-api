package com.algaworks.algafood.api.entities.domain.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "restaurante")
public class RestauranteEntity {

    @Id
    private Long id;

    private String nome;


    private BigDecimal taxaFrete;

}
