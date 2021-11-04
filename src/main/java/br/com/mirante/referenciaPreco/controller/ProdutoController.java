package br.com.mirante.referenciaPreco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mirante.referenciaPreco.domain.Produto;
import br.com.mirante.referenciaPreco.servico.ListarProdutoServico;

@RestController
@RequestMapping("/referenciaPreco")
public class ProdutoController {

	@Autowired
	private ListarProdutoServico servico;

	@GetMapping
	public List<Produto> listarProdutos() {
		return servico.listarProdutos();
	}
}
