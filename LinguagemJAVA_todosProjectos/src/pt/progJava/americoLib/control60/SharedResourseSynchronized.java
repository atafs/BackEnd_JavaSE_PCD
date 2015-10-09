package pt.progJava.americoLib.control60;

//CLASS MULTI-THREAD COM SYNCHRONIZED
public class SharedResourseSynchronized implements Interface_Distribuidor {

	//ATTRIBUTS
	private int valor = -1;				//a ser compartilhado
	private boolean ocupada = false;	//especie de flag

	@Override
	public synchronized void set(int valor) throws InterruptedException {

		while (ocupada) {
			System.out.println("A PONTE ESTA CHEIA!! Produtor deve aguardar...");
			wait();// da classe Object, forma de espera
		}
		System.out.print("[Produziu " + valor + "]");
		this.valor = valor;
		ocupada = true;
		notifyAll();					

	}

	@Override
	public synchronized int get() throws InterruptedException {

		while (!ocupada) {
			System.out.println("PONTE ESTA VAZIA!! Consumidora a aguardar...");
			wait();
		}

		System.err.print("[Consumiu " + valor + "]");// saida em vermelho
		ocupada = false;// acabou de ser lido
		notifyAll();// notificar todas as Threads que a variavel mudou
		return valor;
	}

}
