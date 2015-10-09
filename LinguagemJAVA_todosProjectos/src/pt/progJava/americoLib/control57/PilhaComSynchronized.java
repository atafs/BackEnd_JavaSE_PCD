package pt.progJava.americoLib.control57;

public class PilhaComSynchronized {
	
	//atributos	
	private int pos = 0;
	private int pilha[]= new int[100];
		
	
	public synchronized void push(int i) {
		//request lock
		pos++;
		pilha[pos]=i;
		//free lock
	}
	
	public synchronized int pop() {
		if (pos>0){
			return(pilha[pos--]);
		} else
			return 0;
	}
	
	public synchronized int peak() {
		return pilha[pos];
	}
	
	public int length() {
		return pos;
	}
	
	public void printStack() {
		
		System.out.println("_________________\n");
		for (int i = pos; i > 0; i--) {
			System.out.println(" [VALUE " + i + ": " + pilha[i] + "]\n");
		}
		System.out.println("_________________");
	}

}
