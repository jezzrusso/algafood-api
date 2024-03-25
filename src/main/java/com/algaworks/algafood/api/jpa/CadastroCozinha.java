package com.algaworks.algafood.api.jpa;

import com.algaworks.algafood.api.entities.domain.model.CozinhaEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager manager;

    public List<CozinhaEntity> listar() {
        TypedQuery<CozinhaEntity> query = manager.createQuery("from CozinhaEntity", CozinhaEntity.class);
        return query.getResultList();
    }

}
