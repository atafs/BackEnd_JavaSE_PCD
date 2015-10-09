package pt.progJava.americoLib.control12;

import pt.progJava.americoLib.control12.interface12.Gratificacao;

public class GerenteGeral extends Gerente implements Gratificacao{

	@Override
	public double calculaGratificacao() {
		double gratificacao = this.getSalario()/10;
		return gratificacao;
	}

}
