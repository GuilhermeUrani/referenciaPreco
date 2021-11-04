package br.com.mirante.referenciaPreco.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mirante.referenciaPreco.domain.ReferenciaPreco;
import br.com.mirante.referenciaPreco.repository.ProdutoRepository;
import br.com.mirante.referenciaPreco.repository.ReferenciaPrecoRepository;

@Service
public class ListarReferenciaServico {
	
	@Autowired
	ProdutoRepository repository;
	
	@Autowired
	ReferenciaPrecoRepository precoReferencia;
	
	public List<ReferenciaPreco> listarReferencia(String codigo) {
		return precoReferencia.listarPorCodigo(codigo);
	}

//	public Orcamento recuperar(int id) {
//		return repositorio.recuperar(id);
//
//	}

}
