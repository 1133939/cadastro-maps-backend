package com.fazendeiros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazendeiros.model.Produto;
import com.fazendeiros.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;
	
public void saveProduto(Produto produto) {
	repository.save(produto);
}
public List<Produto> findAll(){
	return repository.findAll();
}
public Produto findProduto(Integer id) {
	Optional<Produto> produto = repository.findById(id);
	return produto.orElse(null);
}
}
