package pt.progJava.americoLib.control12;

import pt.progJava.americoLib.control12.interface12.Gratificacao;

public class GerenteVendas extends Gerente implements Gratificacao {

	@Override
	public double calculaGratificacao() {
		double gratificacao = 50.00;
		return gratificacao;
	}
}
