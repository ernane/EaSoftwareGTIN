package br.com.easoftware.domain;

public class GtinProduto {
	
	public double calculaValor(Gtin gtin) {
		return gtin.getPreco() * gtin.getQuantidade();
	}

	public double aplicaReducao(Gtin gtin, String unidade) {
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
		
		return valor - desconto;
	}
}
