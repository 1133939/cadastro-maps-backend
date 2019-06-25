package com.fazendeiros;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fazendeiros.model.Produto;
import com.fazendeiros.repository.ProdutoRepository;
import com.fazendeiros.service.ProdutoService;

@SpringBootApplication
public class CatalogarFazendeirosApplication implements CommandLineRunner{
@Autowired
private ProdutoService service;
@Autowired
private ProdutoRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(CatalogarFazendeirosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto prod1 = new Produto(null, "Tomate");
		Produto prod2 = new Produto(null, "Feijão de corda");
		Produto prod3 = new Produto(null, "Cebola Roxa");
		Produto prod4 = new Produto(null, "Arroz Branco");
		Produto prod5 = new Produto(null, "Batata Inglesa");
		Produto prod6 = new Produto(null, "Batata Doce");
		Produto prod7 = new Produto(null, "Manteiga");
		Produto prod8 = new Produto(null, "Leite");
		Produto prod9 = new Produto(null, "Queijo");
		Produto prod10 = new Produto(null, "Queijo Coalho");
		Produto prod11 = new Produto(null, "Ovos");
		Produto prod12 = new Produto(null, "Ovos Caipira");
		Produto prod13 = new Produto(null, "Laranja");
		Produto prod14 = new Produto(null, "Abacate");
		
		repository.saveAll(Arrays.asList(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,prod11,prod12,prod13,prod14));
		
		
		
	}
	

}
