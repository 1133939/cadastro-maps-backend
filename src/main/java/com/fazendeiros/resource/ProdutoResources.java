package com.fazendeiros.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fazendeiros.model.Produto;
import com.fazendeiros.service.ProdutoService;

@RestController
@CrossOrigin
@RequestMapping(value="/produtos")
public class ProdutoResources {
	@Autowired
private ProdutoService service;
@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Produto>> findProduto() {
	List<Produto> produtos = service.findAll();
	return ResponseEntity.ok().body(produtos);
		
	}
}
