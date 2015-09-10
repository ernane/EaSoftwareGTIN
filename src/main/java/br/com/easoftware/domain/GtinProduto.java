package br.com.easoftware.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GtinProduto {

	public void cadastraProduto(Produto produto) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EaSoftwareGTIN");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.persist(produto);
		tx.commit();
		em.close();

	}

	public void cadastraGtin(Gtin gtin) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EaSoftwareGTIN");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.persist(gtin);
		tx.commit();
		em.close();

	}
	
	public double aplicaReducaoPorUnidade(Gtin gtin, String unidade) {
		double valor = gtin.getPreco() * gtin.getQuantidade();
		double desconto = 0.0;

		if (unidade == "UN") {
			desconto = 0.01;
		}
		if (unidade == "FD") {
			desconto = 0.05;
		}
		if (unidade == "SC") {
			desconto = 0.02;
		}
		if (unidade == "PC") {
			desconto = 0.02;
		}
		valor = valor - (desconto * valor);

		return valor;
	}
	
	public double aplicaReducaoPorUF(Gtin gtin, String uf){
		double valor = gtin.getPreco() * gtin.getQuantidade();
		double desconto = 0.017;
		double resultado;
		
		if(uf == "PA"){
			desconto = 0.019;
		}
		if(uf == "SP"){
			desconto = 0.013;
		}
		resultado = valor = valor - (desconto * valor);
		return resultado;
	}
}
