package br.com.easoftware.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PrecoGtin {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private Gtin gtin;

	private String unidade;
	private int quantidade;
	private double preco;

	public Gtin getGtin() {
		return gtin;
	}

	public void setGtin(Gtin gtin) {
		this.gtin = gtin;
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
