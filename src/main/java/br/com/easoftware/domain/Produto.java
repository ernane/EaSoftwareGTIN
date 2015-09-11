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
    private List<ClasseGtin> classesgtins = new ArrayList<ClasseGtin>();

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
	
	public List<ClasseGtin> getClassesGtins() {
		return classesgtins;
	}

	public void setGtins(List<ClasseGtin> classesgtins) {
		this.classesgtins = classesgtins;
	}

}
