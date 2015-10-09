package pt.progJava.americoLib.control60;

public interface Interface_Distribuidor {
	
	//classe ponte entre Threads produtoras e consumidoras
	public void set(int valor) throws InterruptedException;
	public int get() throws InterruptedException;

}
