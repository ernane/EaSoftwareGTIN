package br.com.easoftware.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Gtin {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private ClasseGtin classegtin;
	
	@OneToMany(mappedBy="gtin",cascade=CascadeType.PERSIST)
    private List<PrecoGtin> precosgtins = new ArrayList<PrecoGtin>();

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
	
	public List<PrecoGtin> getPrecoGtins() {
		return precosgtins;
	}

	public void setGtins(List<PrecoGtin> precosgtins) {
		this.precosgtins = precosgtins;
	}
}
