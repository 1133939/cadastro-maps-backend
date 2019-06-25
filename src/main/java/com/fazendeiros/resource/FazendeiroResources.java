package com.fazendeiros.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fazendeiros.model.Fazendeiro;
import com.fazendeiros.service.FazendeiroService;

@CrossOrigin
@RestController
@RequestMapping(value="/fazendeiros")
public class FazendeiroResources {
	@Autowired
private FazendeiroService service;
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> findAll(){
		List<Fazendeiro> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Fazendeiro obj){
		service.save(obj);
		return ResponseEntity.created(null).build();
	}
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id){
		List<Fazendeiro> lista = service.findFazendeiroByProduto(id);
		return ResponseEntity.ok().body(lista);
	}

}
