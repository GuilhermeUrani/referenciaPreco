package br.com.mirante.referenciaPreco.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mirante.referenciaPreco.domain.Produto;
import br.com.mirante.referenciaPreco.repository.ProdutoRepository;

@Service
public class ListarProdutoServico {

	@Autowired
	private ProdutoRepository repository;

	public List<Produto> listarProdutos() {
		List<Produto> produtos = repository.listarProdutos();
		return produtos;
	}
}
