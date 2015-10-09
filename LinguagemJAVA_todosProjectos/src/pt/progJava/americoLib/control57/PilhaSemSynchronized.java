package pt.progJava.americoLib.control57;

public class PilhaSemSynchronized {
	
	
	//atributos	
	private int pos = 0;
	private int pilha[]= new int[100];
		
	
	public void push(int i) {
		pos++;
		pilha[pos]=i;
	}
	
	public int pop() {
		if (pos>0){
			return(pilha[pos--]);
		} else
			return 0;
	}
	
	public int peak() {
		return pilha[pos];
	}

	public int length() {
		return pos;
	}
	
	public void printStack() {
		
		System.out.println("_________________\n");
		for (int i = pos; i > 0; i--) {
			System.err.println(" [VALUE " + i + ": " + pilha[i] + "]\n");
		}
		System.out.println("_________________");
	}
	
}
