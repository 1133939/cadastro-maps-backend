package com.fazendeiros.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fazendeiro {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String nome;
private String produtos;
private String telefone;
private String whatsapp;
private String email;
private Double coordenadaX;
private Double coordenadaY;

public Fazendeiro () {
	
}
public Integer getId() {
	return id;
}
public String getNome() {
	return nome;
}
public String getProdutos() {
	return produtos;
}
public String getTelefone() {
	return telefone;
}
public String getWhatsapp() {
	return whatsapp;
}
public String getEmail() {
	return email;
}
public Double getCoordenadaX() {
	return coordenadaX;
}
public Double getCoordenadaY() {
	return coordenadaY;
}
public void setId(Integer id) {
	this.id = id;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setProdutos(String produtos) {
	this.produtos = produtos;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public void setWhatsapp(String whatsapp) {
	this.whatsapp = whatsapp;
}
public void setEmail(String email) {
	this.email = email;
}
public void setCoordenadaX(Double coordenadaX) {
	this.coordenadaX = coordenadaX;
}
public void setCoordenadaY(Double coordenadaY) {
	this.coordenadaY = coordenadaY;
}

}
