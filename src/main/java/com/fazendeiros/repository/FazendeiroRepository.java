package com.fazendeiros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fazendeiros.model.Fazendeiro;
import com.fazendeiros.model.Produto;

@Repository
public interface FazendeiroRepository extends JpaRepository<Fazendeiro,Integer> {
	List<Fazendeiro>findDistinctFazendeiroByProdutos(Produto produtos);
}

