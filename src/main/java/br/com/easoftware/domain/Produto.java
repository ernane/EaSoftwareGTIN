package br.com.easoftware.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	private String Descricao;
	
	@OneToMany(mappedBy="produto",cascade=CascadeType.PERSIST)
    private List<Gtin> gtins = new ArrayList<Gtin>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	public List<Gtin> getGtins() {
		return gtins;
	}

	public void setGtins(List<Gtin> gtins) {
		this.gtins = gtins;
	}

}
