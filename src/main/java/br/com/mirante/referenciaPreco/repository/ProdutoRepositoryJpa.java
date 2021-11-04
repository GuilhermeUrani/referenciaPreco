package br.com.mirante.referenciaPreco.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.mirante.referenciaPreco.domain.Produto;

@Repository
public class ProdutoRepositoryJpa implements ProdutoRepository {

	public ProdutoRepositoryJpa(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Produto> listarProdutos() {
		return entityManager.createQuery("from Produto", Produto.class).getResultList();
	}

}
//	}
//	@Query("from ItemOrcamento i where i.orcamento.id = :idOrcamento")
//	List<Produto> listarPorCodigo(Integer codigoProduto);
//}
