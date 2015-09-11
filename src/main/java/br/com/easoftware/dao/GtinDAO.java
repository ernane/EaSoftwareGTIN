package br.com.easoftware.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.easoftware.util.JPAUtil;
import br.com.easoftware.domain.Gtin;

public class GtinDAO extends Gtin {
	public void cadastraGtin(Gtin gtin) {

		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tran = em.getTransaction();
		
		tran.begin();
		em.persist(gtin);
		tran.commit();
		em.close();
		
	}
}
