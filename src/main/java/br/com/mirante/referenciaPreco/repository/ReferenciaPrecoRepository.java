package br.com.mirante.referenciaPreco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.mirante.referenciaPreco.domain.ReferenciaPreco;

@Repository
public interface ReferenciaPrecoRepository extends JpaRepository<ReferenciaPreco, String>{

//	public List<ReferenciaPreco> listar();
	
	public ReferenciaPreco recuperar(String codigo);
	
	@Query("from ReferenciaPreco r where r.codigoProduto = :codigoProduto")
	List<ReferenciaPreco> listarPorCodigo(String codigo);
}
