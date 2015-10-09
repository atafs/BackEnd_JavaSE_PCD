package pt.progJava.americoLib.control60;

import java.util.LinkedList;

public class SharedResourseNOTSynchronized implements Interface_Distribuidor {

	// atributo
	private int valor = -1;// representar o valor da ponte
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	private LinkedList<Produto> produtos = new LinkedList();

	@Override
	// classe produtora vai usar este metodo
	public void set(int valor) throws InterruptedException {
		System.out.print("Produziu " + valor);// entrada em preto
		this.valor = valor;

	}

	@Override
	public int get() throws InterruptedException {
		System.err.print("Consumiu " + valor);// saida em vermelho
		return valor;
	}

}
