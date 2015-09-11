package br.com.easoftware.business;

import br.com.easoftware.domain.PrecoGtin;

public class GtinBusiness {

	public double aplicaReducaoPorUnidade(PrecoGtin precogtin, String unidade) {
		double desconto;

		switch (unidade) {
		case "UN":
			desconto = 0.01;
			break;
		case "FD":
			desconto = 0.05;
			break;
		case "SC":
			desconto = 0.02;
			break;
		case "PC":
			desconto = 0.02;
			break;
		default:
			desconto = 0;
		}

		return getValorGtin(precogtin) - (desconto * getValorGtin(precogtin));
	}

	public double aplicaReducaoPorUF(PrecoGtin precogtin, String uf) {
		double desconto;
		
		switch (uf) {
		case "PA":
			desconto = 0.019;
			break;
		case "SP":
			desconto = 0.013;
			break;
		default:
			desconto = 0.017;
		}
		
		return getValorGtin(precogtin) - (desconto * getValorGtin(precogtin));
	}

	private double getValorGtin(PrecoGtin precogtin) {
		return precogtin.getPreco() * precogtin.getQuantidade();
	}
}