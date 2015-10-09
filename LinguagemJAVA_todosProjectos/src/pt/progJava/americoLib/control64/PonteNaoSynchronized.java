package pt.progJava.americoLib.control64;

public class PonteNaoSynchronized implements Ponte {

	// atributo
	private int valor = -1;// representar o valor da ponte

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
