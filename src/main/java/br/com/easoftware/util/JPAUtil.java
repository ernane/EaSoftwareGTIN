package br.com.easoftware.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("EaSoftwareGTIN");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}