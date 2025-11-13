package com.gustavolopes.cursomc.repositories;

import com.gustavolopes.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
