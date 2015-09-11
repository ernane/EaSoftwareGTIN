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
	private ClasseGtin classegtin;

	private String nome;
	private String descricao;
	private long gtinTributavel;
	private long gtinComercial;

	public ClasseGtin getClasseGtin() {
		return classegtin;
	}

	public void setProduto(ClasseGtin classegtin) {
		this.classegtin = classegtin;
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
}
