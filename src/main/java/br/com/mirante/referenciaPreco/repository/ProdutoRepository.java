package br.com.mirante.referenciaPreco.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.mirante.referenciaPreco.domain.Produto;

@Repository
public interface ProdutoRepository {

	public List<Produto> listarProdutos();
	
	

	

}
