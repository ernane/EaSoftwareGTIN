package br.com.easoftware.teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.com.easoftware.business.GtinBusiness;
import br.com.easoftware.dao.PrecoGtinDAO;
import br.com.easoftware.domain.PrecoGtin;

public class GtinBusinessTest {

	@Test
	public void aplicaReducaoPorUnidadeTest() {
		GtinBusiness gtin = new GtinBusiness();
		double ValorEsperado = 146.02;
		double valorRetornado = gtin.aplicaReducaoPorUnidade(149.0, "SC");

		assertEquals(ValorEsperado, valorRetornado, 0);

	}
	
	@Test
	public void aplicaReducaoPorUfTest() {
		GtinBusiness gtin = new GtinBusiness();
		double ValorEsperado = 377.685;
		double valorRetornado = gtin.aplicaReducaoPorUF(385.00, "PA");

		assertEquals(ValorEsperado, valorRetornado, 0);

	}

}
