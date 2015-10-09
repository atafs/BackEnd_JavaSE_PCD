package pt.progJava.americoLib.control75_aula1_2;

import java.util.ArrayList;
import java.util.Collection;

public class Partido {
	
	//attributes
	private String nomePartido; //nomePartido
	private int ultimoNumeroMilitante = 0; //ultimo numero de militante
	private int count = 0;
	private ArrayList<Militante> militantes = new ArrayList<Militante>();
	
	//constructor
	public Partido(String nomePartido, Collection<Militante> militantes) {
		this.nomePartido = nomePartido;
		
		for (Militante militante : militantes) {
			inscreveMilitante(militante);
			militante.setNumero(++count);
		}
		
		//verificar numero minimo de militantes
		if(verificaNumeroMilitantesMinimo()) {
			throw new IllegalStateException("ERRO: numero minimo de miliantes NAO atingido");
		}

	}
	
	//getters
	public String getNomePartido() {
		return nomePartido;
	}
	
	//methods 
	public void inscreveMilitante(Militante militante) {
		militante.setNumero(++ultimoNumeroMilitante);
		militantes.add(militante);
	}
	
	public void adequaNumeroMilitantes() {
		//assumindo que os fundadores sao fixos e nao saem de la
		ultimoNumeroMilitante = 10; //os fundadores sao sempre 10; nem mais nem menos; de 1-10 e NAO 0-9;
		for (Militante militante : militantes) {
			if(militante.getNumero() > 10) militante.setNumero(++ultimoNumeroMilitante);
		}
	}
	
	public void retiraMilitante(int numero) {
		
		int indexOfTemp = -1;
		
		//verificar que e valido a remocao de mais um elemento
		if(militantes.size() <= 10) {
			throw new IllegalStateException("ERRO: NAO pode remover od fundadores");
		}
		
		//fazer a pesquisa do numero
		for (Militante militante : militantes) {
			if(militante.getNumero() == numero) {
				indexOfTemp = militantes.indexOf(militante);
				break;
			}
		}
	
		//evita fazer o remove se nao existir o militante
		if(indexOfTemp < 0) {
			System.out.println("ERRO: esse camarada NAO existe!!!");
		} else {
			militantes.remove(indexOfTemp);
		}
	}
	
	public boolean verificaNumeroMilitantesMinimo() {
		return militantes.size() < 10;
	}
	
	@Override
	public String toString() {
		return "[PARTIDO: " + nomePartido + ", Militante numero " + count + ", Tamanho do Partido: " + ultimoNumeroMilitante;
	}

}
