package com.fazendeiros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazendeiros.model.Fazendeiro;
import com.fazendeiros.repository.FazendeiroRepository;

@Service
public class FazendeiroService {
	@Autowired
private FazendeiroRepository repository;
public List<Fazendeiro> findAll(){
	return repository.findAll();	
}
public void save(Fazendeiro obj) {
	repository.save(obj);
}
}
