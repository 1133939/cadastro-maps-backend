package com.fazendeiros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fazendeiros.model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
