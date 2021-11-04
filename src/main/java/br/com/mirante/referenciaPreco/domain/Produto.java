package br.com.mirante.referenciaPreco.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 3610898440866848546L;

	@Id
	private String codigo;
	private String origem;
	private String descricao;

	@Column(name = "UNIDADE_DE_MEDIDA")
	private String unidade;
	private Float valor;

	
	protected Produto() {
	}

	public Produto(String codigo, String origem, String descricao, String unidade, Float valor) {
		super();
		this.codigo = codigo;
		this.origem = origem;
		this.descricao = descricao;
		this.unidade = unidade;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public Float getValor() {
		return valor;
	}

}
