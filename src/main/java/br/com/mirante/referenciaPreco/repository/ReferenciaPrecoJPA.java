package br.com.mirante.referenciaPreco.repository;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.mirante.referenciaPreco.domain.ReferenciaPreco;

public class ReferenciaPrecoJPA {

	@Autowired
	ProdutoRepository repository;

	@Autowired
	ReferenciaPrecoRepository referencia;

	public ReferenciaPreco recuperar(String codigo) {
		return referencia.recuperar(codigo);

	}

//	public List<ReferenciaPreco> recuperarReferenci(String codigo) {
//		return itensRepositorio.listarPorIdOrcamento(idOrcamento);
//		
		
}
