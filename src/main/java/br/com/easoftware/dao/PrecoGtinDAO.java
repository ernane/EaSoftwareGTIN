package br.com.easoftware.dao;


import javax.persistence.EntityManager;

import br.com.easoftware.util.JPAUtil;
import br.com.easoftware.domain.PrecoGtin;

public class PrecoGtinDAO extends PrecoGtin {
	
	public PrecoGtin get(long id){
		EntityManager em = JPAUtil.getEntityManager();
		PrecoGtin preco = em.find(PrecoGtin.class, id);
		return preco;
	}
}
