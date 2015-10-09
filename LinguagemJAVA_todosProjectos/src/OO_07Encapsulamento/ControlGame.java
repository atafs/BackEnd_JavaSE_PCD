package OO_07Encapsulamento;

public class ControlGame {

	/* attributes -------------------- */
	private int direita;
	private int esquerda;

	/* getters and setters ----------------------- */
	public void setDireita(int direita) {
		/*se direito mover (5) unidades de uma vez, o esquerdo desloca (-1) (logica do jogo) */
		this.direita = direita;
		if (direita == 5) {this.esquerda--;}
	}

	public void setEsquerda(int esquerda) {
		this.esquerda = esquerda;
	}

	public int getDireita() {
		return direita;
	}

	public int getEsquerda() {
		return esquerda;
	}

	/* -------------------------------- */
}
