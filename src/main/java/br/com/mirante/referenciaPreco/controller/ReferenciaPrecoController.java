package br.com.mirante.referenciaPreco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.mirante.referenciaPreco.domain.ReferenciaPreco;
import br.com.mirante.referenciaPreco.servico.ListarReferenciaServico;

@RestController
public class ReferenciaPrecoController {
	
	@Autowired
	private ListarReferenciaServico referencia;
	
	@GetMapping("/{codigo}")
	public List<ReferenciaPreco> recuperarReferencia(@PathVariable String codigo) {
		return referencia.listarReferencia(codigo);
	}
	
//	@GetMapping("/{id}")
//	public Orcamento recuperarOrcamento(@PathVariable Integer id) {
//		return detalharServico.recuperar(id);
//	}
	
	
}
//@GetMapping
//public List<ReferenciaPreco> listarReferencia() {
//	return listarReferencia.listarProdutos();
//}