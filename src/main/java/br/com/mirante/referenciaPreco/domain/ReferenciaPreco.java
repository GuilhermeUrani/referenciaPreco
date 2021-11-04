package br.com.mirante.referenciaPreco.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "REFERENCIA_PRECO_PRODUTO")
public class ReferenciaPreco implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6449979531742313494L;

	private String origem;
	private Integer mes;
	private Integer ano;
	private Float valor;

	@ManyToOne
	@JoinColumn(name = "CODIGO_PRODUTO")
	@JsonIgnore
	private Produto produto;

	@Column(name = "CODIGO_PRODUTO", insertable = false, updatable = false)
	private String codigoProduto;

	public ReferenciaPreco(String codigoProduto, String origem, Integer mes, Integer ano, Float valor) {
		super();
		this.codigoProduto = codigoProduto;
		this.origem = origem;
		this.mes = mes;
		this.ano = ano;
		this.valor = valor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public String getOrigem() {
		return origem;
	}

	public Integer getMes() {
		return mes;
	}

	public Integer getAno() {
		return ano;
	}

	public Float getValor() {
		return valor;
	}

}
