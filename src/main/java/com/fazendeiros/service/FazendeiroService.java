package com.fazendeiros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazendeiros.model.Fazendeiro;
import com.fazendeiros.model.Produto;
import com.fazendeiros.repository.FazendeiroRepository;

@Service
public class FazendeiroService {
	@Autowired
private FazendeiroRepository repository;
	@Autowired 
	private ProdutoService produtoService;
	
public List<Fazendeiro> findAll(){
	return repository.findAll();	
}
public void save(Fazendeiro obj) {
	repository.save(obj);
}
public List<Fazendeiro> findFazendeiroByProduto(Integer idProduto) {
	System.out.println("PRODUTO: " +idProduto);
	Produto produto = produtoService.findProduto(idProduto);
	return repository.findDistinctFazendeiroByProdutos(produto);
}
}
