package com.fazendeiros.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Produto {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private  String nome;
@ManyToMany
private List<Fazendeiro> fazendeiros;

public Produto(Integer id, String nome) {
	this.id = id;
	this.nome = nome;
}
public Produto() {
	
}
public Integer getId() {
	return id;
}
public String getNome() {
	return nome;
}
public void setId(Integer id) {
	this.id = id;
}
public void setNome(String nome) {
	this.nome = nome;
}
public List<Fazendeiro> getFazendeiros() {
	return fazendeiros;
}
public void setFazendeiros(List<Fazendeiro> fazendeiros) {
	this.fazendeiros = fazendeiros;
}

}
