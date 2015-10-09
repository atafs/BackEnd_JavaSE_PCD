package pt.progJava.americoLib.control12;

import pt.progJava.americoLib.control12.interface12.Gratificacao;

public class Vendedor implements Gratificacao{

	/*attributes*/
	private double venda;

	/*getters and setters*/
	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	
	public double calculaGratificacao() {
		double gratificacao = this.venda/30;
		return gratificacao;
	}

}
