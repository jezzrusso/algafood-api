package com.algaworks.algafood.api.entities.domain.model;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "restaurante")
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal taxaFrete;

}
