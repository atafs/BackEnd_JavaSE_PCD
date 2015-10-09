package pt.progJava.americoLib.control64;

public interface Ponte {
	
	//classe ponte entre Threads produtoras e consumidoras
	public void set(int valor) throws InterruptedException;
	public int get() throws InterruptedException;

}
