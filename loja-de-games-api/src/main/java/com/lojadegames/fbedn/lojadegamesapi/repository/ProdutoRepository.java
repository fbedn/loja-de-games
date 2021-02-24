package com.lojadegames.fbedn.lojadegamesapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.lojadegames.fbedn.lojadegamesapi.model.Produto;

@RestController
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
}
