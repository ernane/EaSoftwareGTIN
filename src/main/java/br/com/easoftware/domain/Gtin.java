package br.com.easoftware.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Gtin {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private Produto produto;

	private String classe;
	private String nome;
	private String descricao;
	private long gtinTributavel;
	private long gtinComercial;
	private String unidade;
	private int quantidade;
	private double preco;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getGtinTributavel() {
		return gtinTributavel;
	}

	public void setGtinTributavel(long gtinTributavel) {
		this.gtinTributavel = gtinTributavel;
	}

	public long getGtinComercial() {
		return gtinComercial;
	}

	public void setGtinComercial(long gtinComercial) {
		this.gtinComercial = gtinComercial;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
