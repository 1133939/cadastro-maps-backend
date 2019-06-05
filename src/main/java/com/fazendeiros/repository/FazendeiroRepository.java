package com.fazendeiros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fazendeiros.model.Fazendeiro;

@Repository
public interface FazendeiroRepository extends JpaRepository<Fazendeiro,Integer> {
}
