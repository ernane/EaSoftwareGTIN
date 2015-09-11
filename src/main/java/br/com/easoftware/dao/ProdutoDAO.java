package br.com.easoftware.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.easoftware.util.JPAUtil;
import br.com.easoftware.domain.Produto;

public class ProdutoDAO extends Produto {
	
	public void cadastrarProduto(Produto produto) {
		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tran = em.getTransaction();
		
		tran.begin();
		em.persist(produto);
		tran.commit();
		em.close();
	}
}
